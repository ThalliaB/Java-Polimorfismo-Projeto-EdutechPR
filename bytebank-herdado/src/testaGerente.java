
public class testaGerente {

	public static void main(String[] args) {
	
		autenticavel referencia = new gerente();
		
		
		gerente g1 = new gerente();
		g1.setNome("Marco");
		g1.setCpf("235568413");
		g1.setSalario(5000.0);
		
		System.out.println(g1.getNome()); 
		System.out.println(g1.getCpf());
		System.out.println(g1.getSalario());
		
		g1.setSenha(2222);
		boolean autenticou = g1.autentica(2222);
		
		System.out.println(autenticou);
		
		System.out.println(g1.getBonificacao());
		
	}
}
