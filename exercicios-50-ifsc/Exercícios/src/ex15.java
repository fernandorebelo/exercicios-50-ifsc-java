import javax.swing.JOptionPane;

public class ex15 {

	public static void main(String[] args) {
		/*
		 * Solicitar ao usu�rio dois n�meros
		 * informar qual o maior valor
		 */
		int numero1, numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro n�mero: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo n�mero: "));
		
		if(numero1 > numero2) {
			JOptionPane.showMessageDialog(null, "O PRIMEIRO n�mero � maior que o SEGUNDO");
		}else {
			JOptionPane.showMessageDialog(null, "O SEGUNDO n�mero � maior que o PRIMEIRO");
		}
	}

}
