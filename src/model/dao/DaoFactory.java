package model.dao;

import db.DB;
import model.dao.impl.DepartamentDaoJDBC;
import model.dao.impl.UsuarioDaoJDBC;


public class DaoFactory {

	//instanciando implicitamente
	public static UsuarioDao createUsuario() {
		return new UsuarioDaoJDBC(DB.getConnection());
	}
	
	public static DepartamentDao createDepartament() {
		return new DepartamentDaoJDBC();
	}
}
