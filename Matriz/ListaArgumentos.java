package matriz;

public class ListaArgumentos {
public ListaArgumentos() {}
	
	public double media(double... numeros ) {
		double total=0.0;
		for(double numero:numeros) {
			total= total +numero;
		}
		return total /numeros.length;
	}
	

}
