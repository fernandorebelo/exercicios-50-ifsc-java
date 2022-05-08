
public class ParOuImpar {

	public static void main(String[] args) {
		// Uso de OR EXCLUSIVO - xor - ^
		// Identificar se é par ou ímpar
		// Sendo true=1 e false=0
		int par;
		int impar;
		int verificacao;


		//---------------------------------------------------------		
		//Opção 1
		par = 0;
		impar = 0;
		
		System.out.println("Dado que true é 1 e false é 0:");
		
		//Verificação se o número é par ou ímpar
		verificacao = par^impar;
		
		System.out.println("Para par=0 ou impar=0: " + verificacao);

		//---------------------------------------------------------
		//Opção 2
		par = 1;
		impar = 0;
				
		//Verificação se o número é par ou ímpar
		verificacao = par^impar;
				
		System.out.println("Para par=1 ou impar=0: " + verificacao);

		//---------------------------------------------------------
		//Opção 3
		par = 0;
		impar = 1;
						
		//Verificação se o número é par ou ímpar
		verificacao = par^impar;
						
		System.out.println("Para par=0 ou impar=1: " + verificacao);
				
		//---------------------------------------------------------
		//Opção 4
		par = 1;
		impar = 1;
						
		//Verificação se o número é par ou ímpar
		verificacao = par^impar;
								
		System.out.println("Para par=1 ou impar=1: " + verificacao);
				
	}

}
