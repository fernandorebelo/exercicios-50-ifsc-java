import javax.swing.JOptionPane;

public class ex05 {

	public static void main(String[] args) {
		/*
		 * ler a idade de uma pessoa e contar quantos dias ela j� viveu
		 */
		int idade, dias;
		
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
		
		dias = idade * 365;
		
		System.out.println("Voc� j� viveu " + dias + " dias na sua vida!");
	}

}
