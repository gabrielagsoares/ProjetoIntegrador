package br.org.generation.delas.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Positive;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;



@Entity
@Table(name = "tb_postagens")
public class PostagemModel {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	
	private String fotoPost;
	
	@Positive
	private int curtidas;
	
	@Column(columnDefinition = "text")
	private String textoPost;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date data = new java.sql.Date(System.currentTimeMillis());
	
	@ManyToOne
	@JsonIgnoreProperties("categorias")
	private Temas categorias;
	
	@ManyToOne
	@JsonIgnoreProperties("user")
	private UsuarioModel user;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFotoPost() {
		return fotoPost;
	}

	public void setFotoPost(String fotoPost) {
		this.fotoPost = fotoPost;
	}

	public int getCurtidas() {
		return curtidas;
	}

	public void setCurtidas(int curtidas) {
		this.curtidas = curtidas;
	}

	public String getTextoPost() {
		return textoPost;
	}

	public void setTextoPost(String textoPost) {
		this.textoPost = textoPost;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Temas getCategorias() {
		return categorias;
	}

	public void setCategorias(Temas categorias) {
		this.categorias = categorias;
	}

	public UsuarioModel getUser() {
		return user;
	}

	public void setUser(UsuarioModel user) {
		this.user = user;
	}
	
	
	
}
