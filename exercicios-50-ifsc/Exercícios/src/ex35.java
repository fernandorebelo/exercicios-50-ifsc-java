import java.util.Scanner;

public class ex35 {

	public static void main(String[] args) {
		/*
		 * ler 20 n�meros do usu�rio
		 * exibir quantos n�meros s�o maores que 8
		 */
		
		int numero, quantidade = 0;
		
		Scanner in = new Scanner(System.in);

		for(int i = 1; i < 5; i++) {
			System.out.println("Digite um n�mero: ");
			numero = Integer.parseInt(in.nextLine());
			
			if(numero > 8) {
				quantidade++;
			}
		}
		
		System.out.println(quantidade);
	}

}
