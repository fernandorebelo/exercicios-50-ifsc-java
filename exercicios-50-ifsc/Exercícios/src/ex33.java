import java.util.Scanner;

public class ex33 {

	public static void main(String[] args) {
		/*
		 * solicitar 10 números ao usuário
		 * somar todos e tirar a média
		 * usar while
		 */
		Scanner in = new Scanner(System.in);
		
		double soma = 0;
		double media = 0;
				
		for (int i = 1; i <= 5; i++) {
			System.out.println(i + " - Digite um número");
			double numero = Double.parseDouble(in.nextLine());
			soma += numero;
			media = soma / i;
		}
		System.out.println("A média é: " + media);
	}

}
