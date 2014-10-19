package com.openIdeas.apps.apisflorea.aop;

import java.lang.reflect.Method;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.BeanUtils;
import org.springframework.core.Ordered;
import org.springframework.util.ClassUtils;

import com.openIdeas.apps.apisflorea.exception.BizException;
import com.openIdeas.apps.apisflorea.result.Result;

/**
 * 对加注了@Service 标注的类进行拦截，记录执行情况
 * 
 * @author Evan
 */
public class ServiceAdvice implements MethodInterceptor, Ordered {

	private int order;

	/** logger */
	private static final Logger logger = LoggerFactory
			.getLogger(ServiceAdvice.class);

	/** 调用时间阈值 */
	protected long threshold = 2000L;

	public Object invoke(MethodInvocation invocation) throws Throwable {

		Method method = invocation.getMethod();
		Object target = invocation.getThis();

		String methodName = target.getClass().getSimpleName() + "."
				+ method.getName();
		// TraceLog traceLog = new TraceLog(logger, methodName, this.threshold);

		// 判断是否需要包装Result
		boolean wrapResult = Result.class.isAssignableFrom(method
				.getReturnType());

		try {
			// traceLog.begin();

			Object returnObject = invocation.proceed();

			return returnObject;
		} catch (BizException appEx) {
			if (wrapResult) {
				return handleException(method, appEx, appEx.getErrorCode(),
						appEx.getMessage());
			}
			throw appEx;
		} catch (Throwable t) {
			// traceLog.setExType("T");
			logger.error("服务拦截器调用" + methodName + "异常！", t);
			if (wrapResult) {
				return this.handleException(method, t,
						"error.service.interceptor.invoke", "");
			}
			throw t;
		}
		// finally {
		// traceLog.end();
		// traceLog.log();
		// }
	}

	/**
	 * 处理异常
	 * 
	 * @param method
	 *            方法
	 * @param t
	 *            异常
	 * @param errorCode
	 *            错误码
	 * @param message
	 *            错误信息
	 * @return 调用结果
	 */
	private Object handleException(Method method, Throwable t,
			String errorCode, String message) {
		Object result = null;

		if (ClassUtils.isAssignable(Result.class, method.getReturnType())) {
			result = BeanUtils.instantiateClass(method.getReturnType());
			((Result) result).fail(errorCode, message);

			return result;
		} else {
			throw new BizException(errorCode, message);
		}
	}

	public int getOrder() {
		return order;
	}

	public void setOrder(int order) {
		this.order = order;
	}

}