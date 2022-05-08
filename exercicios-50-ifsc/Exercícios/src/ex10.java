import javax.swing.JOptionPane;

public class ex10 {

	public static void main(String[] args) {
		/*
		 * receber o primeiro nome
		 * criar uma saudação
		 */
		String nome;
		
		nome = JOptionPane.showInputDialog("Qual seu nome?").toUpperCase();
		
		JOptionPane.showMessageDialog(null, "Olá, " + nome + "!");
	}

}
