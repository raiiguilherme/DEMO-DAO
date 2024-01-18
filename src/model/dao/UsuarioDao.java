package model.dao;

import java.util.List;


import model.entities.Usuario;

public interface UsuarioDao {

	//metodos a serem implementados pela UsuarioDaoJDBC
	void insert(Usuario obj);
	void update(Usuario obj);
	void deleteById(Usuario obj);
	Usuario findById(Integer id);
	List<Usuario> findAll();
}
