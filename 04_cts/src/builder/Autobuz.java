package builder;

public class Autobuz {
	private String numeSofer;
	private String numarInmatriculare;
	private String numarLinie;
	private Boolean openDoors;
	private Boolean oprireCapatLinie;
	private String textDerulat;
	private int numarLoc;
	
	Autobuz() {
		super();
		this.numeSofer = "Doru";
		this.numarInmatriculare = "b12345";
		this.numarLinie = "1";
		this.openDoors = Boolean.TRUE;
		this.oprireCapatLinie = Boolean.TRUE;
		this.textDerulat = "Ceva";
		this.numarLoc = 3;
	}

	void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}

	void setNumarInmatriculare(String numarInmatriculare) {
		this.numarInmatriculare = numarInmatriculare;
	}

	void setNumarLinie(String numarLinie) {
		this.numarLinie = numarLinie;
	}

	void setOpenDoors(Boolean openDoors) {
		this.openDoors = openDoors;
	}

	void setOprireCapatLinie(Boolean oprireCapatLinie) {
		this.oprireCapatLinie = oprireCapatLinie;
	}

	void setTextDerulat(String textDerulat) {
		this.textDerulat = textDerulat;
	}

	void setNumarLoc(int numarLoc) {
		this.numarLoc = numarLoc;
	}

	@Override
	public String toString() {
		return "Autobuz [numeSofer=" + numeSofer + ", numarInmatriculare=" + numarInmatriculare + ", numarLinie="
				+ numarLinie + ", openDoors=" + openDoors + ", oprireCapatLinie=" + oprireCapatLinie + ", textDerulat="
				+ textDerulat + ", numarLoc=" + numarLoc + "]";
	}
	
	
	
	
	
	
}
