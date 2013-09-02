package exceptions;

public class NOutOfBoundException extends Exception {
	
	/**
	 * This ID is for NOutOfBoundException to be serializable
	 */
	private static final long serialVersionUID = -8321409413244345526L;
	
	public NOutOfBoundException(){
	}
	
	public NOutOfBoundException(String msg){
		super(msg);
	}
}
