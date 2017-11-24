package studentDiary;

public class InvalidPhoneNumberException extends Exception{
  /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	InvalidPhoneNumberException( ) {
    super("Phone no must be 10 digits");
  }
}
