import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		String letrasAlfabeto;
		int numerosInteiros;
		final double PI = 3.14;
		
		letrasAlfabeto = "abc";
		numerosInteiros = 123;
		
		System.out.println("---------------------------------------");
		System.out.println("Letras do alfabeto: " + letrasAlfabeto);
		System.out.println("Números inteiros: " + numerosInteiros);
		System.out.println("Número PI: " + PI);
		
		letrasAlfabeto = "def";
		numerosInteiros = 456;
		
		System.out.println("---------------------------------------");
		System.out.println("Letras do alfabeto 2: " + letrasAlfabeto);
		System.out.println("Números inteiros 2: " + numerosInteiros);
		System.out.println("Número PI: " + PI);
		
	}

}
