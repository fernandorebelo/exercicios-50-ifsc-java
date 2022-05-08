import java.util.Scanner;

public class ex39 {

	public static void main(String[] args) {
		/*
		 * ler a quantidade de funcionários em uma empresa
		 * para cada funcionário ler seu nome e tempo de serviço (em meses)
		 * se o funcionário possuir mais de 12 meses na empresa escrever:
		 * "<nome> tem direito a férias", caso contrário escreve:
		 * "<nome> não tem direito a férias"
		 * ao final exibir quantos funcionários tem direito a férias e quantos não tem
		 */
		
		String nome;
		int tempoServico, quantidadeFuncionarios, 
			contadorDireitoFerias = 0, 
			contadorSemDireitoFerias = 0;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Quantos funcionários tem na empresa?");
		quantidadeFuncionarios = Integer.parseInt(in.nextLine());
		
		
		for(int i = 1; i <= quantidadeFuncionarios; i++) {
			System.out.println(i + " - Qual nome?");
			nome = in.nextLine();
			System.out.println(i + " - Quanto tempo de serviço? (em meses)");
			tempoServico = Integer.parseInt(in.nextLine());
			
			if(tempoServico >= 12) {
				System.out.println(nome + " - Tem direito a férias.");
				contadorDireitoFerias++;
			}else {
				System.out.println(nome + " - Não tem direito a férias.");
				contadorSemDireitoFerias++;
			}
		}
		System.out.println("Quantidade total de funcionários: " + quantidadeFuncionarios);
		System.out.println("Funcionários que tem direito a férias: " + contadorDireitoFerias);
		System.out.println("Funcionários que NÃO tem direito a férias: " + contadorSemDireitoFerias);
	}

}
