import java.util.Scanner;

public class ex49 {

	public static void main(String[] args) {
		/*
		 * ler um número do usuário e criar um padrão quadrado de asteriscos
		 */
		
		String asterisco = " * ";
		int quantidade;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira um número de 1 a 10: ");
		quantidade = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i < quantidade; i++) {
			for(int j = 0; j < quantidade; j++) {
				System.out.print(asterisco);
			}
			System.out.println();
		}
	}

}
