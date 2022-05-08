import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 * ESTRUTURA DE REPETIÇÃO: DO WHILE
		 * perguntar ao usuário até que a palavra seja fim ou sair
		 * ao final, exibir a última palavra que o usuário digitou
		 */
		
		String palavra;
		
		do {
			palavra = JOptionPane.showInputDialog("Digite uma palavra: ");
		}while(!palavra.equalsIgnoreCase("fim") && !palavra.equalsIgnoreCase("sair"));
		
		JOptionPane.showMessageDialog(null, palavra);		
	}

}
