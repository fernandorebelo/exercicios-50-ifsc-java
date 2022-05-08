import java.util.Scanner;
public class ex37variacao {

	public static void main(String[] args) {
		/*
		 * ler um número qualquer do usuário
		 * verificar QUAIS números ímpares existem entre 1 e o número informado
		 */
		
		int numero;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número maior que 1: ");
		numero = Integer.parseInt(in.nextLine());
		
		System.out.println("Os números ímpares entre 1 e " + numero + " são: ");
		
		for(int i = 1; i <= numero; i += 2) {
			System.out.println(i);
		}
	}

}
