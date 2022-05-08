import javax.swing.JOptionPane;

public class ex22 {

	public static void main(String[] args) {
		/*
		 * solicitar um número de 1 a 7
		 * informe o dia da semana correspondente
		 * sendo segunda = 1;
		 */
		int dia;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um dia da semana de 1 a 7"));
		
		switch (dia) {
		case 1:
			System.out.println("Segunda-feira");
			break;
		case 2:
			System.out.println("Terça-feira");
			break;
		case 3:
			System.out.println("Quarta-feira");
			break;
		case 4:
			System.out.println("Quinta-feira");
			break;
		case 5:
			System.out.println("Sexta-feira");
			break;
		case 6:
			System.out.println("Sábado");
			break;
		case 7:
			System.out.println("Domingo");
			break;

		default:
			System.out.println("Número inválido");
			break;
		}
	}

}
