package builderv2;

public class Autobuz {
	private String numeSofer;
	private String model;
	private int numarLinie;
	private int numarLocuri;
	private int numarInmatriculare;
	private Boolean deschideUsi;
	private Boolean opresteLaCapat;
	
	
	 Autobuz(String numeSofer, String model, int numarLinie, int numarLocuri, int numarInmatriculare,
			Boolean deschideUsi, Boolean opresteLaCapat) {
		super();
		this.numeSofer = numeSofer;
		this.model = model;
		this.numarLinie = numarLinie;
		this.numarLocuri = numarLocuri;
		this.numarInmatriculare = numarInmatriculare;
		this.deschideUsi = deschideUsi;
		this.opresteLaCapat = opresteLaCapat;
	}


	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [numeSofer=");
		builder.append(numeSofer);
		builder.append(", model=");
		builder.append(model);
		builder.append(", numarLinie=");
		builder.append(numarLinie);
		builder.append(", numarLocuri=");
		builder.append(numarLocuri);
		builder.append(", numarInmatriculare=");
		builder.append(numarInmatriculare);
		builder.append(", deschideUsi=");
		builder.append(deschideUsi);
		builder.append(", opresteLaCapat=");
		builder.append(opresteLaCapat);
		builder.append("]");
		return builder.toString();
	}
	 
	 
	
	
}
