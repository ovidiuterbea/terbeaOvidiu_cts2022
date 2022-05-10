package state;

public class Autobuz {
	private Stare stare;
	private int nrAutobuz;
	
	public Autobuz(int nrAutobuz) {
		super();
		this.stare = new StareLaCapatLinie();
		this.nrAutobuz = nrAutobuz;
	}

	public Stare getStare() {
		return stare;
	}

	protected void setStare(Stare stare) {
		this.stare = stare;
	}

	public int getNrAutobuz() {
		return nrAutobuz;
	}

	public void setNrAutobuz(int nrAutobuz) {
		this.nrAutobuz = nrAutobuz;
	}
	
	public void pleacaInCursa(){
		StareInCursa stareInCursa = new StareInCursa();
		stareInCursa.doAction(this);
	}
	
	public void ajungeLaCapat(){
		StareLaCapatLinie stareLaCapatLinie = new StareLaCapatLinie();
		stareLaCapatLinie.doAction(this);
	}
	
	public void intraInService(){
		StareInService stareService = new StareInService();
		stareService.doAction(this);
	}
	
	public void ieseDinService(){
		StareLaCapatLinie stareLaCapatLinie = new StareLaCapatLinie();
		stareLaCapatLinie.doAction(this);
	}
	
	
	
	
	
	
	
	
	
}
