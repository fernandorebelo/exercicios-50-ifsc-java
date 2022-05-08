import javax.swing.JOptionPane;

public class ex15 {

	public static void main(String[] args) {
		/*
		 * Solicitar ao usuário dois números
		 * informar qual o maior valor
		 */
		int numero1, numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		if(numero1 > numero2) {
			JOptionPane.showMessageDialog(null, "O PRIMEIRO número é maior que o SEGUNDO");
		}else {
			JOptionPane.showMessageDialog(null, "O SEGUNDO número é maior que o PRIMEIRO");
		}
	}

}
