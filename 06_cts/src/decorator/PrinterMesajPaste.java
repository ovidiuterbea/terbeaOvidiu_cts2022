package decorator;

public class PrinterMesajPaste extends Decorator {

	public PrinterMesajPaste(PrinterBilet printerBilet) {
		super(printerBilet);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afiseazaVerso() {
		System.out.println("Paste fericit");
		System.out.println("Am desenat si un iepuras");
	}

}
