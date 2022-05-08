import java.util.Scanner;

public class ex39 {

	public static void main(String[] args) {
		/*
		 * ler a quantidade de funcion�rios em uma empresa
		 * para cada funcion�rio ler seu nome e tempo de servi�o (em meses)
		 * se o funcion�rio possuir mais de 12 meses na empresa escrever:
		 * "<nome> tem direito a f�rias", caso contr�rio escreve:
		 * "<nome> n�o tem direito a f�rias"
		 * ao final exibir quantos funcion�rios tem direito a f�rias e quantos n�o tem
		 */
		
		String nome;
		int tempoServico, quantidadeFuncionarios, 
			contadorDireitoFerias = 0, 
			contadorSemDireitoFerias = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quantos funcion�rios tem na empresa?");
		quantidadeFuncionarios = Integer.parseInt(in.nextLine());
		
		
		for(int i = 1; i <= quantidadeFuncionarios; i++) {
			System.out.println(i + " - Qual nome?");
			nome = in.nextLine();
			System.out.println(i + " - Quanto tempo de servi�o? (em meses)");
			tempoServico = Integer.parseInt(in.nextLine());
			
			if(tempoServico >= 12) {
				System.out.println(nome + " - Tem direito a f�rias.");
				contadorDireitoFerias++;
			}else {
				System.out.println(nome + " - N�o tem direito a f�rias.");
				contadorSemDireitoFerias++;
			}
		}
		System.out.println("Quantidade total de funcion�rios: " + quantidadeFuncionarios);
		System.out.println("Funcion�rios que tem direito a f�rias: " + contadorDireitoFerias);
		System.out.println("Funcion�rios que N�O tem direito a f�rias: " + contadorSemDireitoFerias);
	}

}
