import javax.swing.JOptionPane;

public class ex14 {

	public static void main(String[] args) {
		/*
		 * Solicitar ao usuário dois números
		 * informar se são iguais
		 */
		int numero1, numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		if(numero1 == numero2) {
			JOptionPane.showMessageDialog(null, "Os números são iguais!");
		}else {
			JOptionPane.showMessageDialog(null, "Os números são diferentes!");
		}
	}

}
