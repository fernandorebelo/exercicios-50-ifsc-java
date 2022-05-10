import javax.swing.JOptionPane;

public class ex47 {

	public static void main(String[] args) {
		/*
		 * simulador caixa de supermercado 
		 * caixa aberto até o fim do expediente 
		 * processar a compra de vários clientes 
		 * cada cliente pode comprar vários itens 
		 * ao ler o item deve perguntar se tem mais itens a serem processados 
		 * ao final exibir quanto a compra custou ao cliente 
		 * solicitar ao operador se deseja fechar o caixa 
		 * encerrar quando o usuário desejar fechar o caixa
		 */
		int valorCompra;
		int encerrarCaixa;
		int contadorCompraTotal = 0;
		int contadorCliente = 0;
		
		JOptionPane.showMessageDialog(null, "ABERTURA DE CAIXA");
		String funcionario = JOptionPane.showInputDialog("FUNCIONÁRIO:").toUpperCase();	
		
		do {		
		int somaCompra = 0;
		
		int novoCliente = JOptionPane.showConfirmDialog(null, funcionario + ", deseja iniciar um novo cliente?");
		contadorCliente++;
		
		while (novoCliente == 0) {
			try {
				valorCompra = Integer.parseInt(JOptionPane.showInputDialog("Qual o valor da compra?"));
				somaCompra += valorCompra;
				contadorCompraTotal += somaCompra;
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, "Erro:" + e);
			}
			int opcaoNovaCompra = JOptionPane.showConfirmDialog(null, "Deseja inserir um novo item?");
			if (opcaoNovaCompra == 1) {
				novoCliente = 1;
				JOptionPane.showMessageDialog(null, "Sua compra deu: R$" + somaCompra);
			}
		}
		
		encerrarCaixa = JOptionPane.showConfirmDialog(null, "Deseja encerrar o caixa de hoje?");
		
		} while (encerrarCaixa == 1);
		
		String fechamentoCaixa = "DADOS DO FECHAMENTO DO CAIXA" + "\n";
		fechamentoCaixa += "Quantidade de clientes de hoje: " + contadorCliente + "\n";
		fechamentoCaixa += "Quantidade total de vendas: R$" + contadorCompraTotal;
		
		JOptionPane.showMessageDialog(null, fechamentoCaixa);
	}
}
