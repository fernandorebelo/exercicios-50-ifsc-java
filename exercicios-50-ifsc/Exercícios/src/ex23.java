import javax.swing.JOptionPane;
import java.util.Scanner;

public class ex23 {

	public static void main(String[] args) {
		/*
		 * pedir dois n�meros ao usu�rio
		 * criar um menu com quatro op��es
		 * 1- somar
		 * 2- subtrair
		 * 3- multiplicar
		 * 4- dividir
		 * executar a opera��o e mostrar o resultado
		 * caso a op��o seja inv�lida, mostrar "Op��o inv�lida"
		 */
		
			double numero1, numero2;			
			
			Scanner in = new Scanner(System.in);

			System.out.println("Digite o primeiro n�mero: ");
			numero1 = Integer.parseInt(in.nextLine());
			System.out.println("Digite o segundo n�mero: ");
			numero2 = Integer.parseInt(in.nextLine());
			
			String menu = "O que voc� deseja fazer?" + "\n";
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
