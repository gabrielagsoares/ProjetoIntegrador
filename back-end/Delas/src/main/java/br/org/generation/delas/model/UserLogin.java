package br.org.generation.delas.model;

public class UserLogin {
	
	private int id;
	
	private String usuario;
	
	private String senha;
	
	private String token;
	
	private String fotoPerfil;
	
	private String tipoUser;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getUsuario() {
		return usuario;
	}

	public void setUsuario(String usuario) {
		this.usuario = usuario;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getToken() {
		return token;
	}

	public void setToken(String token) {
		this.token = token;
	}

	public String getFotoPerfil() {
		return fotoPerfil;
	}

	public void setFotoPerfil(String fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}

	public String getTipoUser() {
		return tipoUser;
	}

	public void setTipoUser(String tipoUser) {
		this.tipoUser = tipoUser;
	}
	
	
	

}
