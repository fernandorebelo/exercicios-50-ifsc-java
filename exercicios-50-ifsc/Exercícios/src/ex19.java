import javax.swing.JOptionPane;

public class ex19 {

	public static void main(String[] args) {
		/*
		 * pedir ao usu�rio um n�mero inteiro
		 * verificar se o n�mero � m�ltiplo de 5
		 * � m�ltiplo de 5 se a divis�o retornar resto 0
		 */
		
		int numero, resto;
		
		numero = Integer.parseInt(JOptionPane.showInputDialog("Digite um n�mero inteiro: "));
		
		resto = numero % 5;
		
		if(resto == 0) {
			JOptionPane.showMessageDialog(null, "O n�mero " + numero + " � um m�ltiplo de 5");
		}else {
			JOptionPane.showMessageDialog(null, "O n�mero " + numero + " N�O � um m�ltiplo de 5");
		}
	}

}
