import java.util.Scanner;

public class ex46variacao {

	public static void main(String[] args) {
		/*
		 * laços de repetição aninhados
		 * exibir hora de 1 a 24
		 * exibir minutos de 1 a 60
		 * exibir segundos de 1 a 60
		 */
		Scanner in = new Scanner(System.in);
		
		for(int hora = 1; hora <= 24; hora++) {
			System.out.println("Hora: " + hora);			
			
			for(int minuto = 1; minuto <= 60 ; minuto++) {
				System.out.println("Hora: " + hora);
				System.out.println("Minuto: " + minuto + " ");
				System.out.print("Segundo: ");
				
				for(int segundo = 1; segundo <= 60; segundo++) {
					System.out.print(segundo + " ");
				}
				System.out.println();
				System.out.println();
			}
		}
		
		
		
	}

}
