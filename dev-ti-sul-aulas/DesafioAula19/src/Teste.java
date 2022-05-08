import javax.swing.JOptionPane;

public class Teste {

	public static void main(String[] args) {
		int dia;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7:"));
		
		switch(dia) {
		case 1:
			JOptionPane.showMessageDialog(null, "Segunda-feira!");
			break;
		case 2:
			JOptionPane.showMessageDialog(null, "Terça-feira!");
			break;
		case 3:
			JOptionPane.showMessageDialog(null, "Quarta-feira!");
			break;
		case 4:
			JOptionPane.showMessageDialog(null, "Quinta-feira!");
			break;
		case 5:
			JOptionPane.showMessageDialog(null, "Sexta-feira!");
			break;
		case 6:
			JOptionPane.showMessageDialog(null, "Sábado!");
			break;
		case 7:
			JOptionPane.showMessageDialog(null, "Domingo!");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Número não encontrado!");
		}
	}

}
