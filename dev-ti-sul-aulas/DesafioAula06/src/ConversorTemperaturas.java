import javax.swing.JOptionPane;

public class ConversorTemperaturas {

	public static void main(String[] args) {
		/*
		 * PROGRAMA 2 - CONVERSOR DE TEMPERATURA CELSIUS -> F/K
		 * Inserir uma temperatura em graus Celsius
		 * Converter esta temperatura inseria para Fahrenheit
		 * Converter esta temperatura inserida para Kelvin
		 */
		
		//converter de Celsius para Fahrenheit
		double celsius;
		double fahren;
		double kelvin;
		
		celsius = Integer.parseInt(JOptionPane.showInputDialog("Valor em Celsius"));
		fahren = celsius * 1.8 + 32;
		
		System.out.println("CONVERTER DE CELSIUS PARA FAHRENHEIT");
		System.out.println("Temperatura em graus Celsius inserida: " + celsius + " ºC");
		System.out.println("Temperatura em Fahrenheit: " + fahren + " ºF");
		System.out.println();
		
		//de Fahrenheit para Kelvin
		celsius = 25;
		kelvin = celsius + 273.15;
		
		System.out.println("CONVERTER DE CELSIUS PARA KELVIN");
		System.out.println("Temperatura em graus Celsius inserida: " + celsius + " ºC");
		System.out.println("Temperatura em Kelvin: " + kelvin + " K");
		System.out.println();
		
	}
	

}
