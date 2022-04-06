package decorator;

public class PrinterBiletCustomizat extends Decorator {

	public PrinterBiletCustomizat(PrinterBilet printerBilet) {
		super(printerBilet);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afiseazaVerso() {
		System.out.println("La multi ani!");
	}

}
