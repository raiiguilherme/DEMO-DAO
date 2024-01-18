package aplication;

import model.dao.DaoFactory;
import model.dao.UsuarioDao;
import model.entities.Usuario;

public class Program {

	public static void main(String[] args) {
		
		//instanciando a interface UsuarioDao chamando o metodo create usuario da classe DaoFactory, 
		//este que por sua vez instancia construtor de UsuarioDaoJDBC
		UsuarioDao usuariodao = DaoFactory.createUsuario();
		
		//instanciando um usuario que recebe um metodo puxado da instancia feita na parte de cima 
		Usuario usuario = usuariodao.findById(23);
		System.out.println(usuario);			//imprimindo
		
		
		

	}

}
