import java.util.Scanner;

public class ex40 {

	public static void main(String[] args) {
		/*
		 * ler uma sequ�ncia de n�meros e somar
		 * mostrar a soma
		 * encerrar quando um n�mero negativo for inserido
		 */
		
		int numero=0, soma=0;
		
		Scanner in = new Scanner(System.in);
		
		while (numero >= 0) {
			System.out.println("Digite um n�mero");
			numero = Integer.parseInt(in.nextLine());
			soma += numero;
			System.out.println("A soma �: " + soma);
			
		}
		System.out.println("A soma FINAL �: " + soma);
	}

}
