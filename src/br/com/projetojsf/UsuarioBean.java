package br.com.projetojsf;

import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.event.ActionEvent;
import javax.faces.event.ValueChangeEvent;

import br.com.projetojsf.dominio.Usuario;

@ManagedBean
@SessionScoped
public class UsuarioBean {

	private Usuario usuarioSelecionado;
	private List<Usuario> usuarios;
	private List<Usuario> usuariosFiltrados;

	public List<Usuario> getUsuariosFiltrados() {
		return usuariosFiltrados;
	}

	private Usuario usuario;
	private String usuarioPesquisa;

	public UsuarioBean() {
		this.usuarios = new ArrayList<Usuario>();
		this.usuario = new Usuario();
	}

	public void verificarInclusao(ActionEvent evento) {
		if ("".equals(this.usuario.getNome())) {
			this.usuario.setNome("Sem nome");
		}
	}

	public void incluir() {
		this.usuarios.add(this.usuario);
		this.usuario = new Usuario();
	}

	public void excluir() {
		this.usuarios.remove(this.usuarioSelecionado);
	}

	public void usuarioPesquisa() {

	}

	public void pesquisar() {
		System.out.println("pesquisando...");
	}

	public void usuarioPesquisaAlterada(ValueChangeEvent evento) {
		System.out.println("Evento de mudança de valor.....");
		System.out.println("Atual : " + this.usuarioPesquisa);

		System.out.println("Novo: " + evento.getNewValue());

		this.usuariosFiltrados.clear();
		for (Usuario usuario : this.usuarios) {
			if (usuario.getNome() != null
					&& usuario.getNome().toLowerCase().startsWith(evento.toString().toLowerCase())) {
				this.usuariosFiltrados.add(usuario);
			}
		}

	}

	public Usuario getUsuarioSelecionado() {
		return usuarioSelecionado;
	}

	public void setUsuarioSelecionado(Usuario usuarioSelecionado) {
		this.usuarioSelecionado = usuarioSelecionado;
	}

	public Usuario getUsuario() {
		return usuario;
	}

	public List<Usuario> getUsuarios() {
		return usuarios;
	}

	public String getUsuarioPesquisa() {
		return usuarioPesquisa;
	}

	public void setusuarioPesquisa(String usuarioPesquisa) {
		this.usuarioPesquisa = usuarioPesquisa;
	}

}
