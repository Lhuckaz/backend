package br.com.doisp.backend.model;

import java.io.Serializable;

public class StatusReponse implements Serializable {
	
	/**
	 * Serial
	 */
	private static final long serialVersionUID = 1L;
	private boolean success = true;

	public boolean isSuccess() {
		return success;
	}

	public void setSuccess(boolean success) {
		this.success = success;
	}

	@Override
	public String toString() {
		return "StatusReponse [success=" + success + "]";
	}

}