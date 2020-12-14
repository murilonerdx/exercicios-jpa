package teste.muitospramuitos;

import infra.DAO;
import modelo.muitospramuitos.Ator;
import modelo.muitospramuitos.Filme;

public class NovoFilmeAtor {

	public static void main(String[] args) {
		Filme filmeA = new Filme("Jogos Forazes", 8.4);
		Filme filmeB = new Filme("Roberto Carlos e a saga secreta", 10.0);
		
		Ator atorA = new Ator("Roberto");
		
		Ator atrizB = new Ator("Ana");
		
		filmeA.adicionarAtor(atorA);
		filmeA.adicionarAtor(atrizB);
		
		filmeB.adicionarAtor(atorA);
		
		DAO<Filme> daoFilme = new DAO<Filme>(Filme.class);

		daoFilme.incluirAtomico(filmeA).incluirAtomico(filmeB);
		
		
		
		
	}

}
