package intranet;

@SuppressWarnings("serial")
public class TooMuchCoursesException extends Exception {
	public TooMuchCoursesException(String message) {
        super(message);
    }
}
