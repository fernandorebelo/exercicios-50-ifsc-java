import javax.swing.JOptionPane;

public class ex08 {

	public static void main(String[] args) {
		/*
		 * ler um valor em d�lar e converte em reais
		 * cota��o do d�lar atual: R$5,00
		 */
		double dolarInput, dolarCotacao, real;
		
		dolarCotacao = 5;
		
		dolarInput = Double.parseDouble(JOptionPane.showInputDialog("Digite o valor em d�lar que voc� quer converter: "));
					
		real = dolarInput * dolarCotacao;
		
		String extrato = "EXTRATO" + "\n";
		extrato += "Convers�o de D�lar para Reais" + "\n";
		extrato += "A cota��o do d�lar do dia � de R$" + dolarCotacao + "\n";
		extrato += "Voc� tem U$" + dolarInput + "\n";
		extrato += "Voc� ter� R$" + real;
		
		JOptionPane.showInternalMessageDialog(null, extrato);
	}

}
