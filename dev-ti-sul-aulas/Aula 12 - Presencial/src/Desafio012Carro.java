import javax.swing.JOptionPane;

public class Desafio012Carro {

	public static void main(String[] args) {
		//Cadastro veículo
		String marca, modelo, ano, cor, km;
		
		marca = JOptionPane.showInputDialog("Marca do carro: ");
		modelo = JOptionPane.showInputDialog("Modelo do carro: ");
		ano = JOptionPane.showInputDialog("Ano do carro: ");
		cor = JOptionPane.showInputDialog("Cor do carro: ");
		km = JOptionPane.showInputDialog("Quilometragem: ");
		
		
		String dadosCarro = "DADOS DO VEÍCULO \n";
		dadosCarro += "Marca: " + marca + "\n";
		dadosCarro += "Modelo: " + modelo + "\n";
		dadosCarro += "Ano: " + ano + "\n";
		dadosCarro += "Cor: " + cor + "\n";
		dadosCarro += "Quilometragem: " + km + "\n";
		
		JOptionPane.showMessageDialog(null, dadosCarro);
	}

}
