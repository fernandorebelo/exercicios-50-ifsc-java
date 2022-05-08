import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Tomar decisão se é vogal ou consoante (switch)
		 * Usuário digita uma letra do alfabeto
		 * De acordo com a letra retornar se ela é vogal ou consoante
		 * Retornar: "Você digitou uma vogal(i)"
		 */
		String letra;
		
		letra = JOptionPane.showInputDialog("Digite uma letra do alfabeto:");
		
		switch (letra) {
		case "a","e","i","o","u":
			JOptionPane.showMessageDialog(null, "Você digitou uma vogal: " + letra);
			break;

		default:
			JOptionPane.showMessageDialog(null, "Você digitou uma consoante: " + letra);
			break;
		}
	}

}
