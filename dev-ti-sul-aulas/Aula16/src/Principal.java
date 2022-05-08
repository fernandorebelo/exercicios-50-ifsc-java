
public class Principal {

	public static void main(String[] args) {
		int a, b;
		boolean retorno;
		
		a = 10;
		b = 10;
		retorno = a == b;
		
		if (retorno) {
			System.out.println("A é IGUAL a B");
		}else {
			System.err.println("A é DIFERENTE de B");
		}
	}

}
