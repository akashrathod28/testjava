package interfacetest;

public interface checkInterface {

	public default String logstring(String temp) {
		return logmessage ("string " + temp);
		
	}
	private String logmessage(String val) {
		return logstring( val + "name ");
	}
	
}
