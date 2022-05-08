
public class AprovadoReprovado {

	public static void main(String[] args) {
		/*
		 * PROGRAMA 1 - APROVADO OU REPROVADO
		 * Criar programa para saber se o aluno foi aprovado ou reprovado:
		 * Inserir nota dos alunos, total de 4 notas
		 * Calcular média das notas
		 * Inserir a frequência do aluno
		 * Se a média do aluno for maior ou igual a 7
		 * E a frequência do aluno for maior ou igual a 70%
		 * Printar na tela se o aluno foi aprovado ou reprovado
		 */
		
		double media;
		int frequencia;		
		double[] notas = {5,8,10,5,8,10,1};
		double somaNotas = 0;
		
		//coloca os valores do array notas na variável i
		for (double i : notas)
			
		//somaNotas = somaNotas + i (soma todos os valores do array)
		somaNotas += i; 
		
		//média de notas
		media = somaNotas / notas.length;
		
		frequencia = 70;
		
		System.out.println("MEDIA E APROVAÇÃO");
		
		//dado que i = 0, enquanto cada item na string notas  
		//for menor que i, somar 1 no i
		for(int i = 0; i < notas.length; i++)
			System.out.println("Notas: " + notas[i]);
		
		System.out.println("-----------------------------");
		System.out.println("MÉDIA: " + media);
		System.out.println("Frequência: " + frequencia);
		System.out.println("-----------------------------");
		System.out.println("Situação: ");
		
		if(frequencia >= 70 && media >= 7) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Reprovado!");
		}
	}

}
