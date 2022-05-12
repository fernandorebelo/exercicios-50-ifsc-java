import java.util.Scanner;

public class ex48 {

	public static void main(String[] args) {
		/*
		 * uma escola tem diversas turmas
		 * ler a quantidade de turmas existentes na escola
		 * para cada turma, ler a quantidade de alunos
		 * para cada aluno ler a média
		 * informar a média de CADA uma das turmas
		 */
		Scanner in = new Scanner(System.in);
		
		int turma, aluno;
		double media;
		
		System.out.println("Quantas turmas tem na escola?");
		turma = Integer.parseInt(in.nextLine());
		
		for(int i = 1; i <= turma; i++) {
			
			double mediaTurma = 0;
			int alunoQuantidade = 0;
			double somaMediaTurma = 0;
			
			System.err.println("Turma " + i);
			
			System.out.println("Quantos alunos tem na turma " + i + "?");
			aluno = Integer.parseInt(in.nextLine());
			alunoQuantidade += aluno;
			
			for(int j = 1; j <= aluno; j++) {
				System.err.println("Turma " + i);
				System.out.println("Aluno " + j);
				
				System.out.println("Qual a média do aluno " + j + "?");
				media = Double.parseDouble(in.nextLine());
								
				somaMediaTurma += media;
				
				mediaTurma = somaMediaTurma / alunoQuantidade;
			}
			System.out.println("A média da turma é de: " + mediaTurma + "\n------------------------");
		}		
	}

}
