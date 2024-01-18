package db;

public class DBIntegrityException extends RuntimeException {

	//exceção personalizada 
	private static final long serialVersionUID = 1L;
	public DBIntegrityException(String st) {
		super(st);
	}
	
	

}
