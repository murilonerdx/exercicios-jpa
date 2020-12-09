package teste.umpramuitos;

import infra.DAO;
import modelo.basico.Produto;
import modelo.umpramuitos.ItemPedido;
import modelo.umpramuitos.Pedido;

public class NovoPedido {

	public static void main(String[] args) {
		DAO<Object> dao = new DAO<>();
		
		Produto produto = new Produto("Geladinho", 5.20);
		
		Pedido pedido = new Pedido();
		ItemPedido item = new ItemPedido(pedido, produto, 10);
		
		dao.abrirT().incluir(produto).incluir(pedido).incluir(item).fecharT().fechar();

	}

}
