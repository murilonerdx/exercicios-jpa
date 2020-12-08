package teste.basico;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import modelo.basico.Usuario;

public class AlterarUsuario1 {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("wm");
		EntityManager em = emf.createEntityManager();
		
		Long posicao = 2L;
		em.getTransaction().begin();
		Usuario usuario = em.find(Usuario.class, posicao);
		
		usuario.setNome("Luis Gustavo");
		usuario.setEmail("luis-gustavo@hotmail.com");
		
		em.merge(usuario);
		
		
		em.getTransaction().commit();
		
		
		em.close();
		emf.close();

	}

}
