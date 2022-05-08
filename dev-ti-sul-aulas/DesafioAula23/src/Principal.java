import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um número inteiro de 1 a 9: "));
		
		System.out.println("Tabuada de multiplicação do número: " + numero);
		
		for(int i = 1; i <= 9; i++) {
			System.out.println(numero + " X " + i + " = " + (numero * i));
		}
	}

}
