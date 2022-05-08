import javax.swing.JOptionPane;
import java.util.Scanner;

public class MediaAprovadoReprovado {
	public static void main(String[] args) {
		String media, frequencia, nome;
		int mediaInt, frequenciaInt, situacao;
		
		nome = JOptionPane.showInputDialog("Digite seu nome:");
		frequencia = JOptionPane.showInputDialog("Você atingiu a frequência? Sim=1 / Não=0");
		media = JOptionPane.showInputDialog("Você atingiu a média? Sim=1 / Não=0");
		
		frequenciaInt = Integer.parseInt(frequencia);
		mediaInt = Integer.parseInt(media);
		
		
		situacao = frequenciaInt * mediaInt;
		
		System.out.println("Nome do aluno: " + nome);
		System.out.println("Situação escolar: ");

		if(situacao == 1 || situacao == 0) {
			if(situacao == 1) {
				System.out.println("Aluno aprovado! Parabéns!");
			}else {
				System.out.println("Reprovado!");
			}
		}else {
			System.out.println("Erro! Digite novamente!");
		}


		
		
	}

}
