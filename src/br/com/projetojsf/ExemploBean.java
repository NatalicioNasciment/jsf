package br.com.projetojsf;

import javax.faces.bean.ManagedBean;

//@ManagedBean
public class ExemploBean {
	
	private String nome;
	private String senha;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public void enviar(){
		this.setNome(getNome().toUpperCase());
	}
	
	
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public void informarSenha(){
		this.setSenha(getSenha().toLowerCase());
	}

}
