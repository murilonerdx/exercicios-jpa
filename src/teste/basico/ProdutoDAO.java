package teste.basico;

import infra.DAO;
import modelo.basico.Produto;

public class ProdutoDAO extends DAO<Produto>{
	public ProdutoDAO() {
		super(Produto.class);
	}
}
