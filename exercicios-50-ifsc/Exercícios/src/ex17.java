import javax.swing.JOptionPane;

public class ex17 {

	public static void main(String[] args) {
		/*
		 * ler uma letra que represente o sexo de uma pessoa
		 * M para masculino
		 * F para feminino
		 * Se for masculino, mostrar "Seja bem-vindo, Senhor!"
		 * Se for feminino, mostrar "Seja bem-vinda, Senhora!"
		 */
		
		String genero;
		
		genero = JOptionPane.showInputDialog("Digite seu sexo (M - para masculino / F - para feminino): ");
		
		if(genero.equalsIgnoreCase("m")) {
			JOptionPane.showMessageDialog(null, "Seja bem-vindo, Senhor");
		}else if(genero.equalsIgnoreCase("f")){
			JOptionPane.showMessageDialog(null, "Seja bem-vinda, Senhora");
		}else {
			JOptionPane.showMessageDialog(null, "Não identificado! Tente novamente!");
		}
	}

}
