package com.openIdeas.apps.apisflorea.result;

import java.util.Collection;

/**
 * 集合结果集
 * 
 * @param <T>
 *            集合型
 * @author 13010158
 * @since 11.4
 */
public class CollectionResult<T extends Collection<?>> extends Result {
	/**
     */
	private static final long serialVersionUID = 5588594498042554601L;

	/** 数据集 */
	private T dataSet;

	public CollectionResult() {

	}

	public CollectionResult(T c) {
		dataSet = c;
	}

	/**
	 * @param dataSet
	 *            the dataSet to set
	 */
	public void setDataSet(T dataSet) {
		this.dataSet = dataSet;
	}

	/**
	 * @return the dataSet
	 */
	public T getDataSet() {
		return dataSet;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * com.suning.framework.lang.Result#copy(com.suning.framework.lang.Result)
	 */
	@SuppressWarnings("unchecked")
	@Override
	public Result copy(Result result) {
		super.copy(result);

		if (result instanceof CollectionResult) {
			CollectionResult<T> collRet = (CollectionResult<T>) result;
			this.dataSet = collRet.dataSet;
		}

		return this;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "CollectionResult [dataSet.size="
				+ (dataSet != null ? dataSet.size() : 0) + ", success="
				+ success + ", errorCode=" + errorCode + ", message=" + message
				+ "]";
	}
}
