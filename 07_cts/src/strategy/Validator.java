package strategy;

public class Validator {
	ModPlata modPlata;
	private float pret;
	public Validator( float pret) {
		super();
		this.modPlata = new CardSTB();
		this.pret = pret;
	}
	
	public void setModPlata(ModPlata modPlata) {
		this.modPlata = modPlata;
	}
	
	public void ValidareCalatorie() {
		modPlata.plateste(pret);
	}
	
}
