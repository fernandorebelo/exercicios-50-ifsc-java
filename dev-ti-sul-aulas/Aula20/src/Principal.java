import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		
		switch(palavra) {
		case "banana":
			JOptionPane.showMessageDialog(null, "A palavra foi banana!");
			break;
		default:
			JOptionPane.showMessageDialog(null, "Palavra não identificada!");
			break;
		}
	}

}
