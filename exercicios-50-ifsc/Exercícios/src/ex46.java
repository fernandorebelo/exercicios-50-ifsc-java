import java.util.Scanner;

public class ex46 {

	public static void main(String[] args) {
		/*
		 * laços de repetição aninhados
		 * exibir na tela a tabuada de 1 a 9
		 */
		Scanner in = new Scanner(System.in);
		
		for(int numero = 1, i = 0; numero < 10; numero++, i++) {
			System.out.println("Tabuada do " + numero);
			
			for(int multiplicador = 1; multiplicador < 10; multiplicador++) {
				System.out.println(numero + " x " + multiplicador + " = " + (numero * multiplicador));
			}
			System.out.println();
		}
	}

}
