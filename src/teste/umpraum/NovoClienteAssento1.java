package teste.umpraum;

import infra.DAO;
import modelo.umpraum.Assento;
import modelo.umpraum.Cliente;

public class NovoClienteAssento1 {

	public static void main(String[] args) {
		Assento assento = new Assento("18C");
		Cliente cliente = new Cliente("Roberto", assento);
		
		Assento assento2 = new Assento("17B");
		Cliente cliente2 = new Cliente("Luan", assento2);
		DAO<Object> dao = new DAO<>();
		
		
		dao.abrirT()
			.incluir(assento2)
			.incluir(cliente2)
			.incluir(assento)
			.incluir(cliente)
			.fecharT()
			.fechar();
	}

}
