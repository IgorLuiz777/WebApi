package br.com.fiap.entity;

import javax.xml.bind.annotation.XmlRootElement;

import br.com.fiap.enums.TipoContatoEnum;

//Pacote: Entity | Model
//Pacote: TO => ContatoTo
@XmlRootElement
public class Contato {
	
	private int id;
	private String nome;
	private String celular;
	private String email;
	private TipoContatoEnum tipo;
	
	public Contato() {
		
	}
	
	public Contato(Integer id, String nome, String celular) {
		this.id = id;
		this.nome = nome;
		this.celular= celular;
	}
	
	
	public Integer getId() {
		return id;
	}
	public void setId(Integer id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getCelular() {
		return celular;
	}
	public void setCelular(String celular) {
		this.celular = celular;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

	public TipoContatoEnum getTipo() {
		return tipo;
	}

	public void setTipo(TipoContatoEnum tipo) {
		this.tipo = tipo;
	}

	public void setId(int id) {
		this.id = id;
	}

}
