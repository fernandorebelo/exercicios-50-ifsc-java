import javax.swing.JOptionPane;

public class ex20 {

	public static void main(String[] args) {
		/*
		 * solicitar ao usuário a temperatura atual em celsius
		 * condições:
		 * abaixo de 18 graus = frio
		 * entre 19 e 23 = agradável
		 * entre 24 e 35 = quente
		 * maior que 36 = muito quente
		 */
		int temperatura;
		
		temperatura = Integer.parseInt(JOptionPane.showInputDialog("Qual a temperatura atual?"));
		
		if(temperatura <= 18) {
			JOptionPane.showMessageDialog(null, "O clima está frio");
		}else if(temperatura > 18 && temperatura < 23) {
			JOptionPane.showMessageDialog(null, "O clima está agradável");
		}else if(temperatura >= 23 && temperatura < 35) {
			JOptionPane.showMessageDialog(null, "O clima está quente");
		}else {
			JOptionPane.showMessageDialog(null, "Tá pegando fogo, bixo!");
		}
	}

}
