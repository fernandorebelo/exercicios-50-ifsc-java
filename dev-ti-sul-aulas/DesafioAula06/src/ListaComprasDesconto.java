
public class ListaComprasDesconto {

	public static void main(String[] args) {
		/*
		 * PROGRAMA 3 - LISTA DE COMPRAS COM DESCONTO
		 * Criar uma lista de compras com alguns itens
		 * Atribuir valores a cada item
		 * Atribuir um desconto do mercado
		 * Printar na tela o valor total da compra
		 * Printar na tela o valor da compra com o desconto
		 * Printar na tela o valor de cada mercadoria antes e depois do desconto
		 */
		
		String item1, item2, item3;
		double valor1, valor2, valor3, valorTotal, desconto, valorFinal;
		
		item1 = "Maçã";
		item2 = "Pão";
		item3 = "Abacate";
		valor1 = 2.5;
		valor2 = 4.9;
		valor3 = 3.5;
		valorTotal = valor1+valor2+valor3;
		desconto = 12;
		valorFinal = valorTotal - (valorTotal * (desconto/100));
		
		System.out.println("SACOLÃO");
		System.out.println("Item: " + item1 + " - Preço: R$" + valor1);
		System.out.println("Item: " + item2 + " - Preço: R$" + valor2);
		System.out.println("Item: " + item3 + " - Preço: R$" + valor3);
		System.out.println("Valor total da compra: R$" + valorTotal);
		System.out.println("Desconto do dia: " + desconto + "%");
		System.out.println("Valor final: R$" + valorFinal);
		
	}

}
