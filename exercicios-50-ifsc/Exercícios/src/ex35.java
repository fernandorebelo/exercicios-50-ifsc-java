import java.util.Scanner;

public class ex35 {

	public static void main(String[] args) {
		/*
		 * ler 20 números do usuário
		 * exibir quantos números são maores que 8
		 */
		
		int numero, quantidade = 0;
		
		Scanner in = new Scanner(System.in);

		for(int i = 1; i < 5; i++) {
			System.out.println("Digite um número: ");
			numero = Integer.parseInt(in.nextLine());
			
			if(numero > 8) {
				quantidade++;
			}
		}
		
		System.out.println(quantidade);
	}

}
