package teste.consulta;

import java.util.List;

import infra.DAO;
import modelo.muitospramuitos.Filme;

public class ObterFilmes {
	public static void main(String[] args) {
		DAO<Filme> dao = new DAO<>(Filme.class);
		
		List<Filme> filmesMaioresQue = dao.consultar("ObterFilmesComNotaMaiorQue", "nota", 8.5);
		List<Filme> filmesMenoresQue = dao.consultar("ObterFilmesComNotaMenorQue", "nota", 8.0);
		for(Filme filme: filmesMaioresQue) {
			System.out.println(filme.getNome());
		}
		
		
		System.out.println("Filmes menores que " + filmesMaioresQue.get(filmesMaioresQue.size() - 1).getNota());
		for(Filme filme2: filmesMenoresQue) {
			System.out.println(filme2.getNome());
		}
		
		
		
		
		
		
		
	}

}
