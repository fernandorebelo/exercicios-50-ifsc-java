import java.util.Scanner;

public class ex42 {

	public static void main(String[] args) {
		/*
		 * jogo de adivinhação
		 * Perguntar "O que é, o que é? Quanto mais se tira, mais a gente tem?"
		 * resposta: fotografia ou foto
		 * Continuar perguntando até o usuário acertar a resposta
		 */
		
		Scanner in = new Scanner(System.in);
		
		String respostaUsuario;
		
		System.out.println("O que é, o que é? Quanto mais se tira, mais a gente tem?");
		respostaUsuario = in.nextLine();
		
		while((respostaUsuario.equalsIgnoreCase("fotografia") || respostaUsuario.equalsIgnoreCase("foto")) != true) {
			System.out.println("Resposta errada! Tente novamente!");
			System.out.println("Responda a pergunta...");
			System.out.println("O que é, o que é? Quanto mais se tira, mais a gente tem?");
			respostaUsuario = in.nextLine();
		}
		System.out.println("Parabéns! Você acertou!");
	}

}
