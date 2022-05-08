import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 * ESTRUTURA DE REPETIÇÃO: WHILE
		 * Iniciar uma variável soma com valor de 0
		 * Pedir um número ao usuário e somar à variável soma
		 * enquanto a soma for menor ou igual a 114, continuar pedindo para o usuário digitar outro número
		 */
		
		int soma = 0;
				
		while(soma <= 114) {
			soma += Integer.parseInt(JOptionPane.showInputDialog("Digite um número: "));
		}
		JOptionPane.showMessageDialog(null, "Passou! A soma foi de " + soma);
	}

}
