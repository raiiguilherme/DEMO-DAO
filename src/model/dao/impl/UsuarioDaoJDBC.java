package model.dao.impl;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import db.DB;
import db.DBException;
import model.dao.UsuarioDao;
import model.entities.Departament;
import model.entities.Usuario;

public class UsuarioDaoJDBC implements UsuarioDao {

	private Connection conn;
	public UsuarioDaoJDBC(Connection conn) {
		this.conn = conn;
	}

	@Override
	public void insert(Usuario obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Usuario obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void deleteById(Usuario obj) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Usuario findById(Integer id) {
		//instanciando os objetos responsaveis pela manipulação no banco de dados
		PreparedStatement ps = null;
		ResultSet rs = null; 
		
		try {
			
			ps = conn.prepareStatement("SELECT * FROM usuario WHERE id_usuario=?"); //query
			ps.setInt(1, id); 											//troca a interrogação
			rs = ps.executeQuery();										//executa a query
			
			//se exitir algum retorno na query:
			if(rs.next()) {
				//instancia de novo objeto chamado "usuario"
			Usuario usuario = new Usuario();
			//atribuindo o retorno do metodo rs.get() aos atributos do objeto "usuario"
			usuario.setId(rs.getInt("id_usuario"));
			usuario.setName(rs.getString("nome"));
			usuario.setIdade(rs.getInt("idade"));
			usuario.setEmail(rs.getString("email"));
			usuario.setSenha(rs.getString("senha"));
			
			//retorna o objeto
			return usuario;
			
			}
				
				return null;
			
		}
		catch (SQLException e) {
			throw new DBException(e.getMessage());
		}
		finally {
			DB.closeStatement(ps);
			DB.closeResultSet(rs);
		}
		
		
		
		
		
		
		
		
	}

	@Override
	public List<Usuario> findAll() {
		//instanciando os objetos responsaveis pela manipulação no banco de dados
				PreparedStatement ps = null;
				ResultSet rs = null; 
				
				try {
					
					ps = conn.prepareStatement("SELECT * FROM usuario"); //query								
					rs = ps.executeQuery();										//executa a query
					
					
					List<Usuario> listu = new ArrayList<>();
					//enquanto existir algum retorno na query:
					while(rs.next()) {
						//instancia de novo objeto chamado "usuario"
					Usuario usuario = new Usuario();
					//atribuindo o retorno do metodo rs.get() aos atributos do objeto "usuario"
					usuario.setId(rs.getInt("id_usuario"));
					usuario.setName(rs.getString("nome"));
					usuario.setIdade(rs.getInt("idade"));
					usuario.setEmail(rs.getString("email"));
					usuario.setSenha(rs.getString("senha"));
					
					//salva na lista
					listu.add(usuario);
					
					}
						
						return listu;
					
				}
				catch (SQLException e) {
					throw new DBException(e.getMessage());
				}
				finally {
					DB.closeStatement(ps);
					DB.closeResultSet(rs);
				}
	}

}
