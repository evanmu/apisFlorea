package com.openIdeas.apps.apisflorea.model;

public class TaskStatus {
	/**
	 * 线程是否完成
	 */
	private boolean isFinish;

	public boolean isFinish() {
		return isFinish;
	}

	public synchronized void finish() {
		this.isFinish = true;
	}

	public synchronized void restart() {
		this.isFinish = false;
	}

}
