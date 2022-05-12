import java.util.Scanner;

public class ex50 {

	public static void main(String[] args) {
		/*
		 * ler um número do usuário e criar um padrão escada descendo de asteriscos
		 */
		
		String asterisco = " * ";
		int quantidade;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Insira um número de 1 a 10: ");
		quantidade = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i < quantidade; i++) {
			for(int j = 0; j < quantidade; j++) {
				if(j <= i) {
					System.out.print(asterisco);
				}
			}
			System.out.println();
		}
	}

}
