import javax.swing.JOptionPane;

public class Desafio012 {

	public static void main(String[] args) {
		
		//Cliente
		
		String nome, cpf, email, telefone, cidade;
		boolean comprou;  
		
		//Leitura informações 
		
		nome = JOptionPane.showInputDialog("NOME DO COMPRADOR: ");
		cpf = JOptionPane.showInputDialog("CPF: ");
		email = JOptionPane.showInputDialog("EMAIL: ");
		telefone = JOptionPane.showInputDialog("TELEFONE: ");
		cidade = JOptionPane.showInputDialog("CIDADE: ");
		comprou = true;

		String cadastro = "DADOS DO CLIENTE" + "\n";
		cadastro += "Nome: " + nome + "\n";
		cadastro += "CPF: " + cpf + "\n";
		cadastro += "E-mail: " + email + "\n";
		cadastro += "Telefone: " + telefone + "\n";
		cadastro += "Cidade: " + cidade + "\n";
		cadastro += "Já é cliente? " + comprou;
		
		//Printar 		
		JOptionPane.showMessageDialog(null, cadastro);
	}

}
