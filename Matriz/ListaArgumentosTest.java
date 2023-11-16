package matriz;

public class ListaArgumentosTest {
	
	public static void main(String[] args) {
		ListaArgumentos objeto = new ListaArgumentos();
		double d1 = 10, d2 = 20, d3 = 30, d4 = 40;
		System.out.println("Media de d1 e d2: "+objeto.media(d1, d2));
		System.out.println("Media de d1 e d2 e d3: "+objeto.media(d1, d2, d3));
		System.out.println("Media de d1 e d2, d3 e d4: "+objeto.media(d1,d2, d3, d4));

}
}
