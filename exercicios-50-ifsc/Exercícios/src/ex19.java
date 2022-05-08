import javax.swing.JOptionPane;

public class ex19 {

	public static void main(String[] args) {
		/*
		 * pedir ao usuário um número inteiro
		 * verificar se o número é múltiplo de 5
		 * é múltiplo de 5 se a divisão retornar resto 0
		 */
		
		int numero, resto;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		
		resto = numero % 5;
		
		if(resto == 0) {
			JOptionPane.showMessageDialog(null, "O número " + numero + " é um múltiplo de 5");
		}else {
			JOptionPane.showMessageDialog(null, "O número " + numero + " NÃO é um múltiplo de 5");
		}
	}

}
