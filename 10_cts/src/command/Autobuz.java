package command;

public class Autobuz {
	private String model;
	
	public Autobuz(String model) {
		super();
		this.model = model;
	}

	public void pleacaInCursa(int nrLinie) {
		System.out.println("Autobuzul de model " + this.model + " a plecat pe linia " + nrLinie);
	}
}
