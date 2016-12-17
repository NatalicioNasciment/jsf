package cadastro;

import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.bean.ManagedBean;
import javax.faces.context.FacesContext;

@ManagedBean
public class CadastroLivrosBean {
	private String titulo;
	private String autor;
	private String descricao;
	private String assunto;

	public void  cadastrar() {
		this.camposVazio();
	}

	public boolean camposVazio() {
		
		for(int i = 0; i < 3; i++){
		
			if (this.getTitulo().equals("")){
				this.adicionarMessagem("frm:titulo", FacesMessage.SEVERITY_ERROR, "Titulo vazio", "Você não preencheu o campo titulo");
			}
			
			if (this.getAutor().equals("")){
				this.adicionarMessagem("frm:autor", FacesMessage.SEVERITY_ERROR, "Autor vazio", "Você não preencheu o campo autor");
			}
			
			if (this.getDescricao().equals("")){
				this.adicionarMessagem("frm:descricao", FacesMessage.SEVERITY_ERROR, "Descrição vazio", "Você não preencheu o campo descrição");
			}
			
			if (this.getAssunto().equals("")){
				this.adicionarMessagem("frm:assunto", FacesMessage.SEVERITY_ERROR, "Assunto vazio", "Você não preencheu o campo  assunto");
			}
			
			return true;
		}
		
		return false;
			
	}

	private void adicionarMessagem(String clienteId, Severity severity, String sumary, String detail) {
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage menssage = new FacesMessage(severity, sumary, detail);
		context.addMessage(clienteId, menssage);
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getAssunto() {
		return assunto;
	}

	public void setAssunto(String assunto) {
		this.assunto = assunto;
	}

}
