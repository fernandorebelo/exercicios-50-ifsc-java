import javax.swing.JOptionPane;

public class ex20 {

	public static void main(String[] args) {
		/*
		 * solicitar ao usu�rio a temperatura atual em celsius
		 * condi��es:
		 * abaixo de 18 graus = frio
		 * entre 19 e 23 = agrad�vel
		 * entre 24 e 35 = quente
		 * maior que 36 = muito quente
		 */
		int temperatura;
		
		temperatura = Integer.parseInt(JOptionPane.showInputDialog("Qual a temperatura atual?"));
		
		if(temperatura <= 18) {
			JOptionPane.showMessageDialog(null, "O clima est� frio");
		}else if(temperatura > 18 && temperatura < 23) {
			JOptionPane.showMessageDialog(null, "O clima est� agrad�vel");
		}else if(temperatura >= 23 && temperatura < 35) {
			JOptionPane.showMessageDialog(null, "O clima est� quente");
		}else {
			JOptionPane.showMessageDialog(null, "T� pegando fogo, bixo!");
		}
	}

}
