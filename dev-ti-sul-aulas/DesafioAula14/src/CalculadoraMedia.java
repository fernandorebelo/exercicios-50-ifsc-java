import javax.swing.JOptionPane;

public class CalculadoraMedia {

	public static void main(String[] args) {
		boolean nota, frequencia, aprovado;
		String nome, sistema;
		double nota1, nota2, nota3, quantidadeNotas, media;
				
		quantidadeNotas = 3;		
		nota = true;
		frequencia = false;
		aprovado = nota & frequencia;
		
		JOptionPane.showMessageDialog(null, "CALCULADORA DE MÉDIA PARA 3 NOTAS" + "\n" + "Pressione Enter para continuar");
		nota1 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 1: "));
		nota2 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 2: "));
		nota3 = Double.parseDouble(JOptionPane.showInputDialog("Qual a nota 3: "));
		
		media = (nota1 + nota2 + nota3) / quantidadeNotas;
		
		sistema = "CALCULADORA DE MÉDIA PARA 3 NOTAS" + "\n";
		sistema += "DADOS INSERIDOS: " + "\n";
		sistema += "Nota 1: " + nota1 + "\n";
		sistema += "Nota 2: " + nota2 + "\n";
		sistema += "Nota 3: " + nota3 + "\n";
		sistema += "Média: " + media + "\n";
		
		JOptionPane.showMessageDialog(null, sistema);
	}

}
