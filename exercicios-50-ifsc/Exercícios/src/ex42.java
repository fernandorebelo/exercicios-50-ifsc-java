import java.util.Scanner;

public class ex42 {

	public static void main(String[] args) {
		/*
		 * jogo de adivinha��o
		 * Perguntar "O que �, o que �? Quanto mais se tira, mais a gente tem?"
		 * resposta: fotografia ou foto
		 * Continuar perguntando at� o usu�rio acertar a resposta
		 */
		
		Scanner in = new Scanner(System.in);
		
		String respostaUsuario;
		
		System.out.println("O que �, o que �? Quanto mais se tira, mais a gente tem?");
		respostaUsuario = in.nextLine();
		
		while((respostaUsuario.equalsIgnoreCase("fotografia") || respostaUsuario.equalsIgnoreCase("foto")) != true) {
			System.out.println("Resposta errada! Tente novamente!");
			System.out.println("Responda a pergunta...");
			System.out.println("O que �, o que �? Quanto mais se tira, mais a gente tem?");
			respostaUsuario = in.nextLine();
		}
		System.out.println("Parab�ns! Voc� acertou!");
	}

}
