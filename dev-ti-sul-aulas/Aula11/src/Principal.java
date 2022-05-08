import javax.swing.JOptionPane;


public class Principal {
	public static void main(String[] args) {
		String nome;
		int atingiuMedia;
		int alcancouFrequencia;
		int situacao;
		
		nome = JOptionPane.showInputDialog("Digite seu nome:");
		atingiuMedia = Integer.parseInt(JOptionPane.showInputDialog("Você atingiu a média? Sim=1 | Não=0"));
		alcancouFrequencia = Integer.parseInt(JOptionPane.showInputDialog("Você alcançou sua frequência? Sim=1 | Não=0"));
		situacao = atingiuMedia * alcancouFrequencia;
		
		System.out.println("Nome: " + nome);
		System.out.println("Atingiu a média? " + atingiuMedia);
		System.out.println("Alcançou frequência? " + alcancouFrequencia);
		System.out.println("Resultado: Passou = 1 | Reprovou = 0");
		System.out.println("Situação: " + situacao);
	}

}
