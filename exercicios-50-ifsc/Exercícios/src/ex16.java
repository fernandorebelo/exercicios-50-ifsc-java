import javax.swing.JOptionPane;

public class ex16 {

	public static void main(String[] args) {
		/*
		 * Pedir um número ao usuário
		 * informar se o número é par um ímpar
		 * se dividir o número por 2 e o resto for 1 o número é ímpar
		 * se dividir o número por 2 e o resto for 0 o número é par
		 */
		
		int numero1, resto;		
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro e positivo: "));
		
		resto = numero1 % 2;
		
		if(resto == 1) {
			JOptionPane.showMessageDialog(null, "O número " + numero1 +" é ímpar!");
		}else {
			JOptionPane.showMessageDialog(null, "O número "+ numero1 +" é par!");
		}
		
		
	}

}
