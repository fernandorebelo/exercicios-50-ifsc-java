import javax.swing.JOptionPane;

public class ex18 {

	public static void main(String[] args) {
		/*
		 * ler dois valores x e y representando um intervalo
		 * ler um terceiro valor z
		 * identificar se o valor z está dentro do intervalo x e y
		 */
		int x, y, z;
		
		x = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para X: "));
		y = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para Y: "));
		z = Integer.parseInt(JOptionPane.showInputDialog("Digite um valor para Z \npara verificar se está dentro do intervalo X e Y: "));
		
		if(z >= x && z <= y) {
			JOptionPane.showMessageDialog(null, "O valor "+ z+ " pertence ao intervalo ["+ x+ ", "+ y+ "]");
		}else {
			JOptionPane.showMessageDialog(null, "O valor "+ z + " NÃO pertence ao intervalo ["+ x + ", "+ y + "]");
		}
	}

}
