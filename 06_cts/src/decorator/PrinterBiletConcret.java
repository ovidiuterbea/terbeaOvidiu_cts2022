package decorator;

public class PrinterBiletConcret implements PrinterBilet {
	
	private String dataEliberare;
	private int pret;
	
	

	public PrinterBiletConcret(String dataEliberare, int pret) {
		super();
		this.dataEliberare = dataEliberare;
		this.pret = pret;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("PrinterBiletConcret [dataEliberare=");
		builder.append(dataEliberare);
		builder.append(", pret=");
		builder.append(pret);
		builder.append("]");
		return builder.toString();
	}


	@Override
	public void afiseazaDescriere() {
		System.out.println(this.toString());
	}

}
