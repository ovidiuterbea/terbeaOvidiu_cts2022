package proxy;

public class Autobuz implements MijlocTransport {
	
	private int nrCalatori;
	private int nrLinie;

	public Autobuz(int nrCalatori, int nrLinie) {
		super();
		this.nrCalatori = nrCalatori;
		this.nrLinie = nrLinie;
	}

	@Override
	public void setNrCalatori(int nrCalatori) {
		this.nrCalatori = nrCalatori;
	}


	public int getNrCalatori() {
		return nrCalatori;
	}

	@Override
	public void opresteInStatie() {
		// TODO Auto-generated method stub
		System.out.println("Autobuzul" + this.nrLinie + " a oprit in statie cu " + this.nrCalatori);
	}

}
