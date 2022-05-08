import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		int numero1, numero2;
		
		numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro número: "));
		numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo número: "));
		
		if(numero1 > numero2) {
			JOptionPane.showMessageDialog(null, "O primeiro número é maior que o segundo!");
		}else if(numero1 < numero2){
			JOptionPane.showMessageDialog(null, "O segundo número é maior que o primeiro!");
		}else {
			JOptionPane.showMessageDialog(null, "Os números são iguais");
		}
	}

}
