package br.org.generation.delas.model;

import java.util.Date;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;





@Entity
@Table(name = "tb_usuarios")
public class UsuarioModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	@NotNull
	private String nome;
	
	@NotNull
	@Size(max = 100)
	private String genero;
	
	// Confirmar se a anotação esta correta e criar uma condição para maior de 18(cadastro)
	@NotNull
	private Date dataNasc;
	
	@NotNull
	@Email
	private String email;
	
	@NotNull
	private String senha;
	
	// Criar uma condição que não permita a repetição de um nome de usuario; findByUser
	@NotNull
	private String user;
	
	private String telefone;
	
	private String fotoPerfil;
	
	@NotNull
	@Column(columnDefinition = "text")
	private String endereco;
	
	private String url;
	
	@Column(columnDefinition = "text")
	private String bio;
	
	@NotNull
	private Boolean tipoUser;
	
	@OneToMany(mappedBy = "user", cascade = CascadeType.ALL)
	@JsonIgnoreProperties("user")
	private List<UsuarioModel> usuario;
	
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public Date getDataNasc() {
		return dataNasc;
	}

	public void setDataNasc(Date dataNasc) {
		this.dataNasc = dataNasc;
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

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public String getFotoPerfil() {
		return fotoPerfil;
	}

	public void setFotoPerfil(String fotoPerfil) {
		this.fotoPerfil = fotoPerfil;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBio() {
		return bio;
	}

	public void setBio(String bio) {
		this.bio = bio;
	}

	public Boolean getTipoUser() {
		return tipoUser;
	}

	public void setTipoUser(Boolean tipoUser) {
		this.tipoUser = tipoUser;
	}

	public List<UsuarioModel> getUsuario() {
		return usuario;
	}

	public void setUsuario(List<UsuarioModel> usuario) {
		this.usuario = usuario;
	}
	
	
	
}
