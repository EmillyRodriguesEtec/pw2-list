import java.util.List;

public class ListagemUsuarios {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Usuario u1 = new Usuario();
		u1.setNome("Emizinha");
		
		Usuario u2 = new Usuario();
		u2.setModerador(true);
		
		Usuario u3 = new Usuario();
		u3.setNome("Paulo");
		
		Usuario u4 = new Usuario();
		u4.setNome("José");
		
		Usuario u5 = new Usuario();
		u5.setNome("Eliane");
		
		List<Usuario>lista= List.of(u1,u2,u3,u4,u5);
		
		
		System.out.println("Quantidade: " + lista.size());
		
		lista.forEach (e ->{
			System.out.println("Nome: " + e.getNome());
			System.out.println("Moderador: " + e.isModerador());
		});
			
	}

}
