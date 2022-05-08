import java.util.Scanner;

public class ex44 {

	public static void main(String[] args) {
		/*
		 * ler a quantidade de alunos em uma turma
		 * para cada aluno, ler as 2 notas
		 * calcular a m�dia de notas e informar se est� aprovado ou reprovado
		 * para estar aprovado = m�dia maior ou igual a 7
		 */
		Scanner in = new Scanner(System.in);
		
		int quantidadeAlunos;
		double nota1, nota2, media;
		
		System.out.println("Quantos alunos tem na turma?");
		quantidadeAlunos = Integer.parseInt(in.nextLine());
		
		for(int i = 1; i <= quantidadeAlunos; i++) {
			System.out.println("Aluno " + i + ":");
			System.out.println("Digite a primeira nota: ");
			nota1 = Double.parseDouble(in.nextLine());
			System.out.println("Digite a segunda nota: ");
			nota2 = Double.parseDouble(in.nextLine());
			
			media = (nota1 + nota2) / 2;
			System.out.println("A m�dia do aluno " + i + " � de : " + media);
			
			if(media >= 7) {
				System.out.println("Aluno APROVADO!");
				System.out.println();
			}else {
				System.out.println("Aluno REPROVADO!");
				System.out.println();
			}
		}
	}

}
