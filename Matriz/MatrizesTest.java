package matriz;
import java.util.Scanner;
public class MatrizesTest {
	
	public static void main(String args[]) {
		Scanner input = new Scanner(System.in);
		matrizes teste = new matrizes();
		double matriz[][]= new double [2][2];
		for(int linha= 0; linha < matriz[0].length; linha++) {
			for(int coluna=0; coluna < matriz[1].length; coluna++) {
				System.out.printf("Digite o valor da linha %d e coluna %d\n", linha,coluna);
				matriz[linha] [coluna]= input.nextDouble();
			}
			
		}
		
		System.out.println("*************Imprimindo Matriz**************");
		for(int linha= 0; linha < matriz[0].length; linha++) {
			for(int coluna=0; coluna < matriz[1].length; coluna++) {
			double aux= matriz[linha][coluna];	
				System.out.printf("O valor armazenado na linha %d  e coluna %d 2= %.2f\n",
						 linha, coluna, aux);
			}
	    }
		
		System.out.println("*************Imprimindo Matriz**************");
		for(int linha= 0; linha < matriz[0].length; linha++) {
			for(int coluna=0; coluna < matriz[1].length; coluna++) {
			double aux= matriz[linha][coluna];	
				System.out.printf("%.2f", aux);
			}
			System.out.println();
	    }
		
		matriz= teste.atualizar(matriz, 0, 1);
		
		System.out.println("*************Imprimindo Matriz**************");
		for(int linha= 0; linha < matriz[0].length; linha++) {
			for(int coluna=0; coluna < matriz[1].length; coluna++) {
			double aux= matriz[linha][coluna];	
				System.out.printf("%.2f", aux);
			}
			System.out.println();
	    }

}
}