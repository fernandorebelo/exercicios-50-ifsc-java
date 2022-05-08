import java.util.Scanner;

public class ex43 {

	public static void main(String[] args) {
		/*
		 * calcular IMC
		 * IMC = peso / (altura * altura)
		 * o programa deve encerrar apenas se um valor menor ou igual a zero for inserido
		 */
		
		Scanner in = new Scanner(System.in);
		
		double peso, altura, imc;
		
		System.out.println("Qual seu peso?");
		peso = Double.parseDouble(in.nextLine());
		System.out.println("Qual sua altura?");
		altura = Double.parseDouble(in.nextLine());
		
		while(peso > 0 && altura > 0) {
			imc = peso / (altura * altura);
			System.out.println("Seu IMC é de : " + imc);
			
			System.out.println("Qual seu peso?");
			peso = Double.parseDouble(in.nextLine());
			System.out.println("Qual sua altura?");
			altura = Double.parseDouble(in.nextLine());
		}
		
	}

}
