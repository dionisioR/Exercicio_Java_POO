package EX002;

public class AbrirConta {

	public static void main(String[] args) {

		var c1 = new ContaBancariaSimplificada();
		c1.AbreConta("Fulano", 100, true);
		System.out.println(c1.MostrarDados());
		
		c1.Retirar(110);
		System.out.println(c1.MostrarDados());
		
		c1.Retirar(90);
		System.out.println(c1.MostrarDados());
		
		System.out.println("----------------------");
		
		var c2 = new ContaBancariaSimplificada();
		c2.AbreContaSimples("Cicrano");
		System.out.println(c2.MostrarDados());
		c2.Depositar(110);
		System.out.println(c2.MostrarDados());
		c2.Depositar(111);
		System.out.println(c2.MostrarDados());
		c2.Retirar(21);
		System.out.println(c2.MostrarDados());

	}

}
