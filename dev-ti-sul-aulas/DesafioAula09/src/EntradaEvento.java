
public class EntradaEvento {

	public static void main(String[] args) {
		//Ser maior de idade ou estar acompanhada de um responsável
		
		boolean idadeMaioridade;
		boolean responsavelAcompanhante;
		boolean permissao;
		
		idadeMaioridade = false;		//Diz se a pessoa é maior ou menor de idade
		responsavelAcompanhante = true;	//Diz se a pessoa está ou não com o acompanhante
		
		//Verificação se a pessoa é maior de idade
		/*
		 * Utilizei o operador || que significa "ou"
		 * idadeMaioridade || responsavelAcompanhante
		 * false(0) + true(1) = true(1);
		 */
		permissao = idadeMaioridade || responsavelAcompanhante;
		
		System.out.println("ENTRADA DO EVENTO");
		System.out.println("Entrada permitida: " + permissao);
		
	}

}
