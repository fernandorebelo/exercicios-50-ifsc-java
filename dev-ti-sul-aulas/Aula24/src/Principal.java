import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 * ESTRUTURA DE REPETIÇÃO: WHILE
		 * perguntar números enquanto o número digitado for menor que 100
		 */
		
		int numero = 0;
		
		while(numero < 100) {
			numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		}
		
		JOptionPane.showMessageDialog(null, "Fim!");
	}

}
