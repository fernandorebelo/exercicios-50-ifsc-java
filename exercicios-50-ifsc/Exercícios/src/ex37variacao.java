import java.util.Scanner;
public class ex37variacao {

	public static void main(String[] args) {
		/*
		 * ler um n�mero qualquer do usu�rio
		 * verificar QUAIS n�meros �mpares existem entre 1 e o n�mero informado
		 */
		
		int numero;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um n�mero maior que 1: ");
		numero = Integer.parseInt(in.nextLine());
		
		System.out.println("Os n�meros �mpares entre 1 e " + numero + " s�o: ");
		
		for(int i = 1; i <= numero; i += 2) {
			System.out.println(i);
		}
	}

}
