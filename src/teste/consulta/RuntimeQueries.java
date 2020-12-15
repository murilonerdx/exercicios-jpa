package teste.consulta;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import infra.DAO;

public class RuntimeQueries {

	public static void main(String[] args) {
		
		
		DAO<Country> dao = new DAO<>(Country.class);
		
//		Country paisBrasil = new Country("Brasil");
//		Country paisAfrica = new Country("Africa");
//		Country paisEUA = new Country("EUA");
//		Country paisPortugal = new Country("Portugal");
//		
//		dao.abrirT().incluir(paisBrasil).incluir(paisAfrica).incluir(paisEUA).incluir(paisPortugal).fecharT();
//		
//		EntityManagerFactory emf = Persistence.createEntityManagerFactory("wm");
//		EntityManager em = emf.createEntityManager();
//		
//		Query query = em.createNamedQuery("Country.findAll");
//
//		@SuppressWarnings("unchecked")
//		List<Country> paises = query.getResultList();
//	
//		for (Country pais : paises) {
//			System.out.println(pais.getNomePais());
//		}
		
		dao.removerPaisPorId(1L);
		
		
		
		

	}

}
