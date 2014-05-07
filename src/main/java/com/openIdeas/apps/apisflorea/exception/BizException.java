package com.openIdeas.apps.apisflorea.exception;

import com.openIdeas.apps.apisflorea.result.Result;

public class BizException extends RuntimeException {

	/**
	 * 
	 */
	private static final long serialVersionUID = 6558522830667790309L;

	/** 错误码 */
	protected String errorCode;

	/**
	 * 构造函数
	 * 
	 * @param errorCode
	 *            错误码
	 */
	public BizException(String errorCode) {
		super(errorCode);
		this.errorCode = errorCode;
	}

	/**
	 * 构造函数
	 * 
	 * @param errorCode
	 *            错误码
	 * @param message
	 *            异常信息
	 */
	public BizException(String errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	/**
	 * 构造函数
	 * 
	 * @param errorCode
	 *            错误码
	 * @param cause
	 *            原异常
	 */
	public BizException(String errorCode, Throwable cause) {
		super(errorCode, cause);
		this.errorCode = errorCode;
	}

	/**
	 * 构造函数
	 * 
	 * @param errorCode
	 *            错误码
	 * @param message
	 *            异常信息
	 * @param cause
	 *            原异常
	 */
	public BizException(String errorCode, String message, Throwable cause) {
		super(message, cause);
		this.errorCode = errorCode;
	}

	public BizException(Result ret) {
		this(ret.getErrorCode(), ret.getMessage());
	}

	/**
	 * 获取错误码
	 * 
	 * @return 错误码
	 */
	public String getErrorCode() {
		return errorCode;
	}

}
