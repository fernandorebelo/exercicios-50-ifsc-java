package tipoDados;

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
		
		//Atribuição de valores
		nome = "Fernando";
		idade = 28;
		mediaFinal = 8.5;
		aprovado = true;
		
		//Exibição
		System.out.println("Informações do aluno!");
		System.out.println("Nome: " + nome);
		System.out.println("Idade: " + idade);
		System.out.println("Média final: " + mediaFinal);
		if (aprovado == true) {
			System.out.println("Aprovado!");
		}else {
			System.out.println("Reprovado");
		}
		
		
		
		/*JOptionPane.showMessageDialog(null, "Informações do aluno");
		JOptionPane.showMessageDialog(null, "Nome: " + nome);
		JOptionPane.showMessageDialog(null, "Idade: " + idade);
		JOptionPane.showMessageDialog(null, "Média final: " + mediaFinal);
		JOptionPane.showMessageDialog(null, "Aprovado: " + aprovado);
		*/
	}

}
