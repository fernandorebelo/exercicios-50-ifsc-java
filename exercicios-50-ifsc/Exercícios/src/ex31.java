import java.util.Scanner;

public class ex31 {

	public static void main(String[] args) {
		/*
		 * solicitar 10 n�meros ao usu�rio e somar todos
		 * usar do while
		 */
		Scanner in = new Scanner(System.in);
		int soma = 0;
		int i = 1;
		
		do {
			System.out.println(i + " - Digite um n�mero: ");
			int numero = Integer.parseInt(in.nextLine());
			soma += numero;
			i++;
		} while (i <= 5);
		
		System.out.println("A soma �: " + soma);
	}

}
