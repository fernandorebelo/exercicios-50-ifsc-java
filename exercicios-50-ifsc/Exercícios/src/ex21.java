import javax.swing.JOptionPane;

public class ex21 {

	public static void main(String[] args) {
		/*
		 * solicitar o valor do salário ao usuário
		 * verificar se o valor informado é:
		 * 1 salário mínimo
		 * até 3 salários mínimoc
		 * até 5 salários mínimos
		 * acima de 5 salários mínimos
		 */
		
		int salario, salarioMinimo;

		salarioMinimo = 1200;
		
		salario = Integer.parseInt(JOptionPane.showInputDialog("Qual seu salário?"));
		
		if(salario <= salarioMinimo) {
			System.out.println("Até 1 salário mínimo");
		}else if(salario > salarioMinimo && salario <= (salarioMinimo * 3)	) {
			System.out.println("Até 3 salários mínimos");
		}else if(salario > (salarioMinimo * 3) && salario <= (salarioMinimo * 5)) {
			System.out.println("Até 5 salários mínimos");
		}else {
			System.out.println("Acima de 5 salários mínimos");
		}
	}

}
