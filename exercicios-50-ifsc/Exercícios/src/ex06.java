import javax.swing.JOptionPane;

public class ex06 {

	public static void main(String[] args) {
		/*
		 * mostrar o resto de uma divis�o
		 */
		int x, y, resto;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		resto = x % y;
		
		System.out.println("O resto da divis�o entre o primeiro e o segundo n�mero �: " + resto);		
	}

}
