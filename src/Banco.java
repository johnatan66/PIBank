import model.Conta;
import model.ContaEspecial;

public class Banco {
	public static void main(String args[]) {
		/* exemplo um
		
		Conta c = new Conta("Johnatan","111.222.333-X", 10001, 2000.0f);
		
		ContaEspecial c1 = new ContaEspecial("Ana", "222.333.444-X", 20001, 300.0f,2000.0f);
		
		System.out.println(c);
		c.depositarNaConta(300.f);
		System.out.println(c);
		c.saqueDaConta(300.f);
		System.out.println(c);
		
		System.out.println("\n\n\n");
		
		System.out.println(c1);
		c1.depositarNaConta(100.f);
		System.out.println(c1);
		c1.saqueDaConta(600.0f);
		System.out.println(c1);
		*/
		
		Conta c1, c2, c3, c4;
		
		c1 = new Conta("Johnatan","111.222.333-X", 10001, 2000.0f);
		c2 = new ContaEspecial("Ana", "333.333.444-X", 20001, 300.0f,2000.0f);
		c3 = new Conta("Johnatan","444.222.333-X", 10001, 2000.0f);
		c4 = new ContaEspecial("Ana", "555.333.444-X", 20001, 300.0f,2000.0f);
		
		System.out.println(c1);
		System.out.println(c2);
		System.out.println(c3);
		System.out.println(c4);
	}

}
