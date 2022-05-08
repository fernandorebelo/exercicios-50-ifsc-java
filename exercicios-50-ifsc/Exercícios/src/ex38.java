import java.util.Scanner;

public class ex38 {

	public static void main(String[] args) {
		/*
		 * ler o ano de nascimento de uma pessoa
		 * criar linha do tempo mostrando:
		 * cada ano de vida da pessoa e quantos anos ela tinha em cada ano até hoje
		 */
		int anoNascimento;
		int anoAtual = 2022;
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Qual seu ano de nascimento?");
		anoNascimento = Integer.parseInt(in.nextLine());
		
		for(int i = anoNascimento, idade = 0; i <= anoAtual; i++, idade++) {
			System.out.println("Ano - " + i + " | Idade - " + idade + " anos");
		}
	}

}
