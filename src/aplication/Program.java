package aplication;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;
import java.util.Scanner;

import model.dao.DaoFactory;
import model.dao.UsuarioDao;
import model.entities.Usuario;

public class Program {

	public static void main(String[] args) throws SQLException {
		Scanner sc = new Scanner(System.in);
		
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
		System.out.println();
		Usuario us = new Usuario("Xica", 39, "xica1234@gmail.com", "12345333");
		System.out.println("inserindo o usuario: "+us);
		usuariodao.insert(us);
		
		//alterando dados ja existentes
		System.out.println();
		System.out.println("informações antigas do usuario:");
		 us = usuariodao.findById(26);  //adicionando o usuario retornado da busca pelo id na variavel
		 System.out.println(us);
		us.setEmail("teste123@gmail.com"); //realizando alguma alteração
		System.out.println("\n");
		usuariodao.update(us);				//subindo o update
		System.out.println("novas informações:");
		 System.out.println(us);
		
		
		
		//excluindo e mostrando nova lista sem o usuario excluido
		 System.out.println("entre com id para excluir:");
		 int id = sc.nextInt();
		 usuariodao.deleteById(id);
		 System.out.println("Usuario excluido com sucesso");
		 System.out.println("Nova lista:");
		 System.out.println("\n");
		 List<Usuario> lisExc = usuariodao.findAll(); 
			for (Usuario usuario2 : lisExc) {
				System.out.println(usuario2);
			}
		 
		 
		

	}

}
