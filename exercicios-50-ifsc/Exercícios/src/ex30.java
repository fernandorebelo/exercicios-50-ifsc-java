import java.util.Scanner;

public class ex30 {

	public static void main(String[] args) {
		/*
		 * solicitar 10 números ao usuário e somar todos
		 * usar while
		 */
		Scanner in = new Scanner(System.in);
		int i = 1;
		int soma = 0;
		
		while (i <= 10) {
			System.out.println(i + " - Digite um número: ");
			int numero = Integer.parseInt(in.nextLine());
			soma += numero;
			i++;			
		}
		System.out.println("A soma dos dez números digitados é: " + soma);
	}

}
