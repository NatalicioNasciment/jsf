package br.com.projetojsf;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

import br.com.projetojsf.dominio.Produto;
@ManagedBean
@SessionScoped
public class GestaoProdutosBean {
	private List<Produto> produtos;
	private Produto produto;
	
	public GestaoProdutosBean(){
		this.produtos = new ArrayList<Produto>();
		this.produto = new Produto();
	}
	
	public void incluir(){
		this.produtos.add(this.produto);
		this.produto = new Produto();
	}
	
	public Produto getProduto(){
		return produto;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}
	
	

}
