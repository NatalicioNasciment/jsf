package cadastro;

import java.util.Calendar;

import javax.annotation.ManagedBean;
import javax.faces.application.FacesMessage;
import javax.faces.application.FacesMessage.Severity;
import javax.faces.context.FacesContext;

@javax.faces.bean.ManagedBean
public class x {

	private String nome;
	private String email;
	private String senha;

	public void cadastrar() {
		if (this.getNome() == null || this.getNome().length() < 10) {
			this.adicionarMensagem("frm:nome", FacesMessage.SEVERITY_ERROR, "Nome incompleto",
					"Seu nome está imcompleto");
		}

		if (hojeEhDiaDeDescanso()) {
			this.adicionarMensagem(null, FacesMessage.SEVERITY_WARN, "Hoje é dia de descanso",
					"Você não pode cadastrar usuarios hoje");
		}
		
		FacesContext context = FacesContext.getCurrentInstance();
		if(!context.getMessages().hasNext()){
			this.adicionarMensagem(null, FacesMessage.SEVERITY_INFO, "Cadastro sucesso", "Usuario cadastrado com sucesso!!");
		}
	}

	private void adicionarMensagem(String clienteId, Severity serverity, String sumary, String detail) {
		// É um objeto que contem as informações de cada requisição que o jsf
		// faz. uma das coisas que fica no faces context é
		// a fila de mensagens
		FacesContext context = FacesContext.getCurrentInstance();
		FacesMessage message = new FacesMessage(serverity, sumary, detail);
		context.addMessage(clienteId, message);
	}

	private boolean hojeEhDiaDeDescanso() {
		return Calendar.getInstance().get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
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

}
