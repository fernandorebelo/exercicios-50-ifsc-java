import javax.swing.JOptionPane;

public class ex02 {

	public static void main(String[] args) {
		/*
		 * pedir um n�mero ao usu�rio e mostrar seu sucessor
		 */
		int numero;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: "));
		numero += 1;
		
		System.out.println("O sucessor do seu n�mero �: " + numero);
	}

}
