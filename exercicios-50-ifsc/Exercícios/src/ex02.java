import javax.swing.JOptionPane;

public class ex02 {

	public static void main(String[] args) {
		/*
		 * pedir um número ao usuário e mostrar seu sucessor
		 */
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		numero += 1;
		
		System.out.println("O sucessor do seu número é: " + numero);
	}

}
