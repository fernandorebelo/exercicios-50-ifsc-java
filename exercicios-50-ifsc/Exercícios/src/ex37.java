import java.util.Scanner;

public class ex37 {

	public static void main(String[] args) {
		/*
		 * ler um n�mero qualquer do usu�rio
		 * verificar QUANTOS n�meros �mpares existem entre 1 e o n�mero informado
		 */
		
		int numero;
		int contador = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um n�mero maior que 1: ");
		numero = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i <= numero; i+= 2) {
			if(i % 2 != 0) {
				contador++;
			}
		}
		System.out.println("A quantidade de n�meros �mpares entre 1 e " + numero + " s�o: " + contador);
	}

}
