import java.util.Scanner;

public class ex37 {

	public static void main(String[] args) {
		/*
		 * ler um número qualquer do usuário
		 * verificar QUANTOS números ímpares existem entre 1 e o número informado
		 */
		
		int numero;
		int contador = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Digite um número maior que 1: ");
		numero = Integer.parseInt(in.nextLine());
		
		for(int i = 0; i <= numero; i+= 2) {
			if(i % 2 != 0) {
				contador++;
			}
		}
		System.out.println("A quantidade de números ímpares entre 1 e " + numero + " são: " + contador);
	}

}
