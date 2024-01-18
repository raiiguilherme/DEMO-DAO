package model.entities;

import java.io.Serializable;
import java.util.Objects;

public class Usuario implements Serializable{

	
	private static final long serialVersionUID = 1L;
	
	private int id;
	private String name;
	private int idade;
	private String email;
	private String senha;
	
	//private Departament departament;

	public Usuario() {
	
	}

	public Usuario(int id, String name, int idade, String email, String senha) {
		
		this.id = id;
		this.name = name;
		this.idade = idade;
		this.email = email;
		this.senha = senha;
		
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	//public Departament getDepartament() {
	//	return departament;
	//}

	//public void setDepartament(Departament departament) {
	//	this.departament = departament;
	//}

	

	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public String toString() {
		return "Usuario [id=" + id + ", name=" + name + ", idade=" + idade + ", email=" + email + ", senha=" + senha
				+ "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		return id == other.id;
	}
	
	
	
}
