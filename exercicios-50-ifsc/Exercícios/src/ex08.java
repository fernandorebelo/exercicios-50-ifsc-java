import javax.swing.JOptionPane;

public class ex08 {

	public static void main(String[] args) {
		/*
		 * ler um valor em dólar e converte em reais
		 * cotação do dólar atual: R$5,00
		 */
		double dolarInput, dolarCotacao, real;
		
		dolarCotacao = 5;
		
		dolarInput = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em dólar que você quer converter: "));
					
		real = dolarInput * dolarCotacao;
		
		String extrato = "EXTRATO" + "\n";
		extrato += "Conversão de Dólar para Reais" + "\n";
		extrato += "A cotação do dólar do dia é de R$" + dolarCotacao + "\n";
		extrato += "Você tem U$" + dolarInput + "\n";
		extrato += "Você terá R$" + real;
		
		JOptionPane.showInternalMessageDialog(null, extrato);
	}

}
