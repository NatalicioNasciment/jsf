package br.com.projetojsf;

import javax.faces.bean.ManagedBean;
import javax.faces.component.html.HtmlCommandButton;
import javax.faces.component.html.HtmlInputText;

@ManagedBean
public class TestBean {
	private HtmlInputText nome;
	private HtmlCommandButton cadastrar;
	
	public void teste(){
		
		if(this.nome.isDisabled()){
			this.nome.setDisabled(false);
			this.cadastrar.setStyle("");
		}else{
			this.nome.setDisabled(true);
			this.cadastrar.setStyle("background-color : red; color : white");
		}
		
		
	}
	public HtmlInputText getNome() {
		return nome;
	}
	public void setNome(HtmlInputText nome) {
		this.nome = nome;
	}
	public HtmlCommandButton getCadastrar() {
		return cadastrar;
	}
	public void setCadastrar(HtmlCommandButton cadastrar) {
		this.cadastrar = cadastrar;
	}
}
