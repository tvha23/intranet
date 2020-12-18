package intranet;

public class TooShortPasswordException extends Exception {
	public TooShortPasswordException(String message, Throwable error)
	{
		super(message, error);
	}
	/*
	 Use at the driver with try catch block to detect When user wants to change their password to a password that less than 6 character
	 */
}
