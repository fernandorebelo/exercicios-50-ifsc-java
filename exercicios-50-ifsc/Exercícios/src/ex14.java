import javax.swing.JOptionPane;

public class ex14 {

	public static void main(String[] args) {
		/*
		 * Solicitar ao usu�rio dois n�meros
		 * informar se s�o iguais
		 */
		int numero1, numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		
		if(numero1 == numero2) {
			JOptionPane.showMessageDialog(null, "Os n�meros s�o iguais!");
		}else {
			JOptionPane.showMessageDialog(null, "Os n�meros s�o diferentes!");
		}
	}

}
