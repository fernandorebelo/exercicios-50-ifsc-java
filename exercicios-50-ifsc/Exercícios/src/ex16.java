import javax.swing.JOptionPane;

public class ex16 {

	public static void main(String[] args) {
		/*
		 * Pedir um n�mero ao usu�rio
		 * informar se o n�mero � par um �mpar
		 * se dividir o n�mero por 2 e o resto for 1 o n�mero � �mpar
		 * se dividir o n�mero por 2 e o resto for 0 o n�mero � par
		 */
		
		int numero1, resto;		
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro e positivo: "));
		
		resto = numero1 % 2;
		
		if(resto == 1) {
			JOptionPane.showMessageDialog(null, "O n�mero " + numero1 +" � �mpar!");
		}else {
			JOptionPane.showMessageDialog(null, "O n�mero "+ numero1 +" � par!");
		}
		
		
	}

}
