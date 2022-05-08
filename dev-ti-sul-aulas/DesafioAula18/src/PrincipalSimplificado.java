import javax.swing.JOptionPane;

public class PrincipalSimplificado {

	public static void main(String[] args) {
		String nome;
		int idade;
		boolean acompanhado, ingresso;
		
		nome = JOptionPane.showInputDialog("Qual seu nome?");
		idade = Integer.parseInt(JOptionPane.showInputDialog("Qual sua idade?"));
		acompanhado = Boolean.parseBoolean(JOptionPane.showInputDialog("Está acompanhado? true/false"));
		ingresso = Boolean.parseBoolean(JOptionPane.showInputDialog("Você tem ingresso em mãos? Sim/Não").toLowerCase().replace("Sim", "true"));

		if ((idade >= 18 || acompanhado) && ingresso) {
			String informacoes = "DADOS DO CLIENTE" + "\n";
			informacoes += "Nome: " + nome + "\n";
			informacoes += "Idade: " + idade + "\n";
			informacoes += "Acompanhado: " + acompanhado + "\n";
			informacoes += "Ingresso: " + ingresso + "\n";
			informacoes += "Acesso LIBERADO ao evento!";
			JOptionPane.showMessageDialog(null, informacoes);
		}else {
			String informacoes = "DADOS DO CLIENTE" + "\n";
			informacoes += "Nome: " + nome + "\n";
			informacoes += "Idade: " + idade + "\n";
			informacoes += "Acompanhado: " + acompanhado + "\n";
			informacoes += "Ingresso: " + ingresso + "\n";
			informacoes += "Acesso NEGADO ao evento!";
			JOptionPane.showMessageDialog(null, informacoes);
		}
		
	}

}
