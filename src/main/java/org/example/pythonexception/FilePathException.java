package org.example.pythonexception;

public class FilePathException extends RuntimeException{


	public FilePathException() {
	}

	public FilePathException(String message) {
		super(message);
	}

	public FilePathException(String message, Throwable cause) {
		super(message, cause);
	}

	public FilePathException(Throwable cause) {
		super(cause);
	}

	public FilePathException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}
}
