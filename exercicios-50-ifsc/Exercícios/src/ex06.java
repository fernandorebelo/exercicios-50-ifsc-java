import javax.swing.JOptionPane;

public class ex06 {

	public static void main(String[] args) {
		/*
		 * mostrar o resto de uma divisão
		 */
		int x, y, resto;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor: "));
		
		resto = x % y;
		
		System.out.println("O resto da divisão entre o primeiro e o segundo número é: " + resto);		
	}

}
