package cadastro;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;

@ManagedBean
@ViewScoped
public class ConsultaClienteBean {

	private List<Cliente> clientes = new ArrayList<Cliente>();

	public void consultar() {
		this.getClientes().add(new Cliente(1, "Pedro Pereira", "Uberlandia"));
		this.getClientes().add(new Cliente(2, "José da Silva", "Araguari"));
		this.getClientes().add(new Cliente(4, "Joaquim Manoel", "Uberaba"));
		this.getClientes().add(new Cliente(6, "Sebastiao Souza", "Sao Paulo"));
		this.getClientes().add(new Cliente(7, "Joana Carvalho", "Uberlandia"));
		this.getClientes().add(new Cliente(10, "Maria Jose", "Rio de Janeiro"));
	}

	public List<Cliente> getClientes() {
		return this.clientes;
	}

	public void salvar() {
		for (Cliente cliente : this.getClientes()) {
			System.out.println(cliente.getCodigo() + " -> " + cliente.getNome());
		}
	}

}