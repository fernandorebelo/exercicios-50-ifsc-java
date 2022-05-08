import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		boolean ganharLoteria, estarVivo, comprarCasa;
		
		ganharLoteria = true;
		estarVivo = true;
		comprarCasa = ganharLoteria && estarVivo;
		
		if(comprarCasa) {
			System.out.println("Comprar uma casa");
		}
	}

}
