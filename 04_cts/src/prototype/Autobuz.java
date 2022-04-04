package prototype;

public class Autobuz implements PachetTransport {
	private String numeSofer;
	
	public Autobuz() {};

	public Autobuz(String numeSofer) {
		super();
		this.numeSofer = numeSofer;
	}
	

	public String getNumeSofer() {
		return numeSofer;
	}

	public void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}

	@Override
	public String toString() {
		return "Autobuz [numeSofer=" + numeSofer + "]";
	}

	@Override
	public Autobuz copiaza() {
		Autobuz autobuz = new Autobuz();
		autobuz.setNumeSofer(this.getNumeSofer());
		return autobuz;
	}
	
	
}
