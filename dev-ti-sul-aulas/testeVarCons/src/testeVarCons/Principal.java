package testeVarCons;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//INFORMAÇÕES DO ALUNO
		
		//Declaração de variáveis
		final String nome;
		final int idade;
		double mediaFinal;
		boolean aprovado;
		double nota1 = 9;
		double nota2 = 7;
		double nota3 = 0;
		double totalNotas = 3;
		
		//Atribuição de valores
		nome = "Fernando";
		idade = 28;
		mediaFinal = (nota1+nota2+nota3)/totalNotas;		
		
		//Exibição0
		System.out.println("Informações do aluno!");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Média final: " + mediaFinal);
		if (mediaFinal >= 7) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Reprovado!");
		}

	}

}
