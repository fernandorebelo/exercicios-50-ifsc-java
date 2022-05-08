import javax.swing.JOptionPane;

public class ex09 {

	public static void main(String[] args) {
		int x, y, auxiliar;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro valor:"));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo valor:"));
		
		auxiliar = x;
		x = y;
		y = auxiliar;
		
		JOptionPane.showMessageDialog(null, "O primeiro valor é " + x);
		JOptionPane.showMessageDialog(null, "O segundo valor é " + y);
		
	}

}
