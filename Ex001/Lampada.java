package Ex001;

// Figura 1.2
// Exercício da Lâmpada

public class Lampada {
	private boolean estado_lampada;
	
	public Lampada() {
		estado_lampada = true;
	}
	
	public String Acender() {
		estado_lampada = true;
		return Mostrar_Estado();
	}
	
	public String Apagar() {
		estado_lampada =  false;
		return Mostrar_Estado();
	}
	
	public String Mostrar_Estado() {
		if (estado_lampada) {
			return "A Lâmpada está acesa!";
		}
		return "A Lâmpada está apagada";
	}
}
