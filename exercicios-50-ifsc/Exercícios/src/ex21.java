import javax.swing.JOptionPane;

public class ex21 {

	public static void main(String[] args) {
		/*
		 * solicitar o valor do sal�rio ao usu�rio
		 * verificar se o valor informado �:
		 * 1 sal�rio m�nimo
		 * at� 3 sal�rios m�nimoc
		 * at� 5 sal�rios m�nimos
		 * acima de 5 sal�rios m�nimos
		 */
		
		int salario, salarioMinimo;

		salarioMinimo = 1200;
		
		salario = Integer.parseInt(JOptionPane.showInputDialog("Qual seu sal�rio?"));
		
		if(salario <= salarioMinimo) {
			System.out.println("At� 1 sal�rio m�nimo");
		}else if(salario > salarioMinimo && salario <= (salarioMinimo * 3)	) {
			System.out.println("At� 3 sal�rios m�nimos");
		}else if(salario > (salarioMinimo * 3) && salario <= (salarioMinimo * 5)) {
			System.out.println("At� 5 sal�rios m�nimos");
		}else {
			System.out.println("Acima de 5 sal�rios m�nimos");
		}
	}

}
