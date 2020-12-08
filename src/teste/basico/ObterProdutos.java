package teste.basico;

import java.util.List;

import infra.DAO;
import modelo.basico.Produto;

public class ObterProdutos {

	public static void main(String[] args) {
		ProdutoDAO dao = new ProdutoDAO();
		List<Produto> produtos = dao.obterTodos();
		
		for(Produto p: produtos) {
			System.out.println("Produto " + p.getNome() + " Preco "
					+ p.getPreco());
		}
		
		double precoTotal = produtos.stream().map(p -> p.getPreco()).reduce(0.0, (a, b) -> a + b).doubleValue();
		System.out.println("O preco total é  " + precoTotal);
		dao.fechar();
	}

}
