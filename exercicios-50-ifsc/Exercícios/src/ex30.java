import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
		/*
		 * solicitar 10 n�meros ao usu�rio e somar todos
		 * usar while
		 */
		Scanner in = new Scanner(System.in);
		int i = 1;
		int soma = 0;
		
		while (i <= 10) {
			System.out.println(i + " - Digite um n�mero: ");
			int numero = Integer.parseInt(in.nextLine());
			soma += numero;
			i++;			
		}
		System.out.println("A soma dos dez n�meros digitados �: " + soma);
	}

}
