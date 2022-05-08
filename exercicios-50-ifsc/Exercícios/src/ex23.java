import javax.swing.JOptionPane;
import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		/*
		 * pedir dois números ao usuário
		 * criar um menu com quatro opções
		 * 1- somar
		 * 2- subtrair
		 * 3- multiplicar
		 * 4- dividir
		 * executar a operação e mostrar o resultado
		 * caso a opção seja inválida, mostrar "Opção inválida"
		 */
		
			double numero1, numero2;			
			
			Scanner in = new Scanner(System.in);

			System.out.println("Digite o primeiro número: ");
			numero1 = Integer.parseInt(in.nextLine());
			System.out.println("Digite o segundo número: ");
			numero2 = Integer.parseInt(in.nextLine());
			
			String menu = "O que você deseja fazer?" + "\n";
			menu += "1 - Somar" + "\n";
			menu += "2 - Subtrair" + "\n";
			menu += "3 - Multiplicar" + "\n";
			menu += "4 - Dividir" + "\n";
			
			System.out.println(menu);
			int opcaoMenu = Integer.parseInt(in.nextLine());
			
			switch(opcaoMenu) {
			case 1:
				System.out.println(numero1 + numero2);
				break;
			case 2:
				System.out.println(numero1 - numero2);
				break;
			case 3:
				System.out.println(numero1 * numero2);
				break;
			case 4:
				System.out.println(numero1 / numero2);
				break;
			}		
	}

}
