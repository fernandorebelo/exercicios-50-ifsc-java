import javax.swing.JOptionPane;

public class ex13 {

	public static void main(String[] args) {
		/*
		 * Pedir um n�mero ao usu�rio
		 * informar se � positivo ou negativo
		 */
		
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro positivo ou negativo: "));
		
		if(numero < 0) {
			JOptionPane.showMessageDialog(null, "O n�mero " + numero + " � negativo!");
		}else {
			JOptionPane.showMessageDialog(null, "O n�mero " + numero + " � positivo!");
		}
	}

}
