package facade;

public class Facade {
	private Autobuz autobuz;
	
	public Facade() {
		super();
		this.autobuz = new Autobuz();
	}

	public void deschideAll() {
		autobuz.dUsaFata();
		autobuz.dUsaMijloc();
		autobuz.dUsaSpate();
	}
	
	public void inchideAll() {
		autobuz.lUsaFata();
		autobuz.lUsaMijloc();
		autobuz.lUsaSpate();
	}
}
