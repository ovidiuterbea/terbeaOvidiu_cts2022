package proxy;

public class AutobuzDeNoapte implements MijlocTransport{
	
	private Autobuz autobuz;
	
	public AutobuzDeNoapte(Autobuz autobuz) {
		super();
		this.autobuz = autobuz;
	}

	@Override
	public void opresteInStatie() {
		if(this.autobuz.getNrCalatori() > 0) {
			this.autobuz.opresteInStatie();
		} else {
			System.out.println("Se retrage la autobaza");
		}
	
	}

	@Override
	public void setNrCalatori(int nr) {
		this.autobuz.setNrCalatori(nr);
	}

}
