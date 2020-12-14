package modelo.consulta;

import infra.DAO;

public class ObterMediaDosFilmes {

	public static void main(String[] args) {
		DAO<NotaFilme> dao = new DAO<>(NotaFilme.class);
		
		
		NotaFilme notaMedia = dao.consultarUm("ObterMediaGeralDosFilmes");
		
		System.out.println(notaMedia.getMedia());
		
		dao.fechar();
		
		
		 

	}

}
