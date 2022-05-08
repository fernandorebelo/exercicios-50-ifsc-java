import javax.swing.JOptionPane;

public class ex07 {

	public static void main(String[] args) {
		/*
		 * ler o salário de um funcionário
		 * reajustar o salário em 7% e mostrar o resultado
		 */
		double salario, reajustePorcentagem, reajusteFracao, salarioReajuste;
		
		salario = Double.parseDouble(JOptionPane.showInputDialog("Qual seu salário?"));
		reajustePorcentagem = Double.parseDouble(JOptionPane.showInputDialog("Qual o reajuste do seu salário em %?"));
		reajusteFracao = reajustePorcentagem / 100;
		
		salarioReajuste = salario + (salario * reajusteFracao);
		
		JOptionPane.showMessageDialog(null, "O salário com reajuste de " + reajustePorcentagem + "% é de: R$" + salarioReajuste);
	}

}
