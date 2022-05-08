import javax.swing.JOptionPane;

public class ex12 {

	public static void main(String[] args) {
		/*
		 * Pedir ao usuário: nome, endereço, telefone
		 * printar na tela
		 */
		
		String nome, endereco, telefone, dados;
		
		nome = JOptionPane.showInputDialog("Qual seu nome?").toUpperCase();
		endereco = JOptionPane.showInputDialog("Qual seu endereço?").toUpperCase();
		telefone = JOptionPane.showInputDialog("Qual seu telefone?");
		
		dados = "DADOS CADASTRAIS" + "\n";
		dados += "Nome: " + nome + "\n";
		dados += "Endereço: " + endereco + "\n";
		dados += "Telefone: " + telefone + "\n";
		
		JOptionPane.showMessageDialog(null, dados);
	}

}
