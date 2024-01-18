package db;

public class DBException extends RuntimeException{

	
	private static final long serialVersionUID = 1L;
	//exceção personalizada 
	public DBException(String msg) {
		super(msg);
	}

}
