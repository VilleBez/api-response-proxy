package org.exception;

import org.response.Warning;

public abstract class ValidateException extends Exception {

	private static final long serialVersionUID = 27465869316380653L;

	public enum Type {
		PARAMETER("1"), LOGIC("2");

		private String value;

		private Type(String value) {
			this.value = value;
		}

		public String getValue() {
			return this.value;
		}
	}
	
	public ValidateException(String message) {
		super(message);
	}

	public Warning getWarning(){
		return new Warning(getCode(), getDesc());
	}
	
	protected abstract String getCode();
	protected abstract String getDesc();


}