package Exception;

public class NotNiceException extends Exception{
	
		

		public NotNiceException(String msg) {
			super(msg);
			System.out.println("new exception");

		}
		
}
