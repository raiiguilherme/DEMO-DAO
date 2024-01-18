package aplication;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import model.dao.DaoFactory;
import model.dao.UsuarioDao;
import model.entities.Usuario;

public class Program {

	public static void main(String[] args) throws SQLException {
		
		//instanciando a interface UsuarioDao chamando o metodo create usuario da classe DaoFactory, 
		//este que por sua vez instancia construtor de UsuarioDaoJDBC
		UsuarioDao usuariodao = DaoFactory.createUsuario();
		
		//instanciando um usuario que recebe um metodo puxado da instancia feita na parte de cima 
		System.out.println("BUSCANDO POR ID");
		System.out.println();
		Usuario usuario = usuariodao.findById(23);
		System.out.println(usuario);			//imprimindo
		System.out.println();
		
		
		
		System.out.println("MOSTRANDO TODOS DA TABELA");
		System.out.println();
		List<Usuario> lis = usuariodao.findAll(); //instanciando uma lista que recebe a lista que retorna do metodo findAll()
		for (Usuario usuario2 : lis) {
			System.out.println(usuario2);
		}
		
		
		//inserindo novo usuario usando o construtor que nao possui ID como argumento
		Usuario us = new Usuario("Xica", 39, "xica1234@gmail.com", "12345333");
		System.out.println("inserindo o usuario: "+us);
		usuariodao.insert(us);
		
		
		

	}

}
