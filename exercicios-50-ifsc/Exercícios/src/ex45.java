import java.util.Scanner;
import javax.swing.JOptionPane;

public class ex45 {

	public static void main(String[] args) {
		/*
		 * loja de gato e cachorro
		 * ler a quantidade de animais da loja
		 * para cada animal ler se é gato ou cachorro
		 * no final exibir quantidade de animais que são gatos e cachorros existentes
		 */
		Scanner in = new Scanner(System.in);
		
		int quantidadeAnimais, quantidadeGato=0, quantidadeCachorro=0;
		String animal;
		
		System.out.println("Quantos animais ao total tem na loja?");
		quantidadeAnimais = Integer.parseInt(in.nextLine());
		
		for(int i = 1; i <= quantidadeAnimais; i++) {
			System.out.println("Animal " + i + ": escreva se é gato ou cachorro?");
			animal = in.nextLine();
			
			if(animal.equalsIgnoreCase("gato")) {
				quantidadeGato++;
			}else if(animal.equalsIgnoreCase("cachorro")) {
				quantidadeCachorro++;
			}else {
				System.out.println("Tente novamente");
			}
		}
		
		System.out.println("Quantidade de animais na loja: " + quantidadeAnimais);
		System.out.println("Quantidade de GATOS: " + quantidadeGato);
		System.out.println("Quantidade de CACHORROS: " + quantidadeCachorro);
	}

}
