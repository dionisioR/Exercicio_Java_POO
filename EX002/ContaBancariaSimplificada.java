package EX002;

// figura 1.3
public class ContaBancariaSimplificada {
	String nomeDoCorrentista;
	double saldo;
	boolean contaEspecial;

	public void AbreConta(String nome, double deposito, boolean contaEspecial) {
		nomeDoCorrentista = nome;
		saldo = deposito;
		this.contaEspecial = contaEspecial;
	}

	public void AbreContaSimples(String nome) {
		nomeDoCorrentista = nome;
	}

	public void Depositar(double value) {
		saldo += value;
	}

	public void Retirar(double value) {
		if(saldo >= value) {
			saldo -= value;
		}
		
	}

	public String MostrarDados() {
		return "Nome: " + nomeDoCorrentista + " Saldo: " + saldo + " Tipo da conta: "
				+ ((contaEspecial) ? "Especial" : "Simples");

	}
}
