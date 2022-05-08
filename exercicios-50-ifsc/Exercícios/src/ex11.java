import javax.swing.JOptionPane;

public class ex11 {

	public static void main(String[] args) {
		/*
		 * receber uma frase
		 * printar a frase
		 */
		String frase;
		
		frase = JOptionPane.showInputDialog("Digite uma mensagem para o desenvolvedor: ");
		
		JOptionPane.showMessageDialog(null, frase);
	}

}
