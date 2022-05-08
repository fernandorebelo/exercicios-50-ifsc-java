import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		/*
		 * Criar estrutura switch
		 * Pedir ao usuário digitar um número de 1 a 7
		 * Cada número corresponde a um dia da semana
		 * Exibir o dia da semana na tela
		 * Considere: 1 é segunda-feira e assim por diante
		 * Retornar na tela:
		 * O dia da semana é Segunda-feira
		 */
		
		int dia;
		String diaSemana;
		
		dia = Integer.parseInt(JOptionPane.showInputDialog("Digite um número de 1 a 7"));
				
		switch(dia) {
			case 1:
				diaSemana = "O dia da semana é Segunda-feira!";
				break;
			case 2:
				diaSemana = "O dia da semana é Terça-feira!";
				break;
			case 3:
				diaSemana = "O dia da semana é Quarta-feira!";
				break;
			case 4:
				diaSemana = "O dia da semana é Quinta-feira!";
				break;
			case 5:
				diaSemana = "O dia da semana é Sexta-feira!";
				break;
			case 6:
				diaSemana = "O dia da semana é Sábado-feira!";
				break;
			case 7:
				diaSemana = "O dia da semana é Domingo-feira!";
				break;
			default:
				diaSemana = "Dia não encontrado! Digite um valor de 1 a 7!";
				break;
		}
		System.out.println(diaSemana);
		
	}

}
