package teste.basico;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;

import modelo.basico.Usuario;

public class ObterUsuarios {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("wm");
		EntityManager em = emf.createEntityManager();
		
//		String jpql = "select u from Usuario u";
//		TypedQuery<Usuario> query = em.createQuery("select u from Usuario u", Usuario.class);
//		query.setMaxResults(5);
		
		List<Usuario> usuarios = em.createQuery("select u from Usuario u", Usuario.class).setMaxResults(5).getResultList();
		
		for(Usuario u : usuarios) {
			System.out.println("Nome: "+ u.getNome() + " ID: " + u.getId() + " E-mail: " + u.getEmail());
		}
		
		em.close();
		emf.close();

	}

}
