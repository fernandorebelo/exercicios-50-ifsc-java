import javax.swing.JOptionPane;

public class ex07 {

	public static void main(String[] args) {
		/*
		 * ler o sal�rio de um funcion�rio
		 * reajustar o sal�rio em 7% e mostrar o resultado
		 */
		double salario, reajustePorcentagem, reajusteFracao, salarioReajuste;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Qual seu sal�rio?"));
		reajustePorcentagem = Double.parseDouble(JOptionPane.showInputDialog("Qual o reajuste do seu sal�rio em %?"));
		reajusteFracao = reajustePorcentagem / 100;
		
		salarioReajuste = salario + (salario * reajusteFracao);
		
		JOptionPane.showMessageDialog(null, "O sal�rio com reajuste de " + reajustePorcentagem + "% � de: R$" + salarioReajuste);
	}

}
