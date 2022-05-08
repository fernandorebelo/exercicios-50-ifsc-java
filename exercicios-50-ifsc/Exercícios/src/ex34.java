import java.util.Scanner;

public class ex34 {

	public static void main(String[] args) {
		/*
		 * ler o nome e idade de 10 pessoas
		 * exibir o nome e a idade da pessoa mais nova
		 */
		
		String nome, nomeMaisNovo;
		int idade, idadeMaisNovo;
		
		Scanner in = new Scanner(System.in);
		
		
		//Solicita nome e idade
		System.out.println("Qual seu nome?");
		nomeMaisNovo = in.nextLine();
		System.out.println("Qual sua idade?");
		idadeMaisNovo = Integer.parseInt(in.nextLine());	
		
		//Solicita mais nomes
		for(int i = 1; i < 5; i++) {
			System.out.println("Qual seu nome?");
			nome = in.nextLine();
			System.out.println("Qual sua idade?");
			idade = Integer.parseInt(in.nextLine());
			
			//Verifica a menor idade dos nomes citados acima
			if(idade < idadeMaisNovo) {
				nomeMaisNovo = nome;
				idadeMaisNovo = idade;
			}
		}
		
		System.out.println("Nome do mais novo: " + nomeMaisNovo);
		System.out.println("Idade do mais novo: " + idadeMaisNovo);
	}

}
