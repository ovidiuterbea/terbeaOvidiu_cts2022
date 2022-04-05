package builderv2;

public class AutobuzBuilder implements Builder {
	
	private String numeSofer;
	private String model;
	private int numarLinie;
	private int numarLocuri;
	private int numarInmatriculare;
	private Boolean deschideUsi;
	private Boolean opresteLaCapat;

	@Override
	public Autobuz build() {
		return new Autobuz(numeSofer,model,numarLinie,numarLocuri,numarInmatriculare,deschideUsi,opresteLaCapat);
	}

	public AutobuzBuilder setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
		return this;
	}

	public AutobuzBuilder setModel(String model) {
		this.model = model;
		return this;
	}

	public AutobuzBuilder setNumarLinie(int numarLinie) {
		this.numarLinie = numarLinie;
		return this;
	}

	public AutobuzBuilder setNumarLocuri(int numarLocuri) {
		this.numarLocuri = numarLocuri;
		return this;
	}

	public AutobuzBuilder setNumarInmatriculare(int numarInmatriculare) {
		this.numarInmatriculare = numarInmatriculare;
		return this;
	}

	public AutobuzBuilder setDeschideUsi(Boolean deschideUsi) {
		this.deschideUsi = deschideUsi;
		return this;
	}

	public AutobuzBuilder setOpresteLaCapat(Boolean opresteLaCapat) {
		this.opresteLaCapat = opresteLaCapat;
		return this;
	}
	
	
	
	

	
	
}
