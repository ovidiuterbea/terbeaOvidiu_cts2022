package factory_method;

public abstract class MijlocTransport {
	protected String numarInmatriculare;

	public MijlocTransport(String numarInmatriculare) {
		super();
		this.numarInmatriculare = numarInmatriculare;
	}
	
	public abstract void afiseazaDescriere();
	
	
}
