package decorator;

public abstract class Decorator implements PrinterBilet {
	private PrinterBilet printerBilet;
	
	public Decorator(PrinterBilet printerBilet) {
		super();
		this.printerBilet = printerBilet;
	}
	
	@Override
	public void afiseazaDescriere() {
		printerBilet.afiseazaDescriere();
	}
	
	public abstract void afiseazaVerso();
}
