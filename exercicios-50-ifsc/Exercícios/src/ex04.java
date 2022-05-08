import javax.swing.JOptionPane;

public class ex04 {

	public static void main(String[] args) {
		/*
		 * multiplicação de dois números dados pelo usuário
		 */
		int numero1, numero2, resultado;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número inteiro: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número inteiro: "));
		
		resultado = numero1 * numero2;
		
		System.out.println("O primeiro número multiplicado pelo segundo é: " + resultado);
	}

}
