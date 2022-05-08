import javax.swing.JOptionPane;

public class ex03 {

	public static void main(String[] args) {
		/*
		 * pedir um número ao usuário e mostrar seu antecessor
		 */
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro: "));
		numero -= 1;
		
		System.out.println("O antecessor do seu número é: " + numero);
	}

}
