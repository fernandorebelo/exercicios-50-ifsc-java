import javax.swing.JOptionPane;

public class ex04 {

	public static void main(String[] args) {
		/*
		 * multiplica��o de dois n�meros dados pelo usu�rio
		 */
		int numero1, numero2, resultado;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero inteiro: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero inteiro: "));
		
		resultado = numero1 * numero2;
		
		System.out.println("O primeiro n�mero multiplicado pelo segundo �: " + resultado);
	}

}
