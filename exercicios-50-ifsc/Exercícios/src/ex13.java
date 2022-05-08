import javax.swing.JOptionPane;

public class ex13 {

	public static void main(String[] args) {
		/*
		 * Pedir um número ao usuário
		 * informar se é positivo ou negativo
		 */
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro positivo ou negativo: "));
		
		if(numero < 0) {
			JOptionPane.showMessageDialog(null, "O número " + numero + " é negativo!");
		}else {
			JOptionPane.showMessageDialog(null, "O número " + numero + " é positivo!");
		}
	}

}
