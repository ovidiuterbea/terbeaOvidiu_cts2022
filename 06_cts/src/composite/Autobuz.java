package composite;


public class Autobuz implements MijlocTransport {
	
	private String model;
	private String producator;
	private int nrLocuri;
	
	public Autobuz(String model, String producator, int nrLocuri) {
		super();
		this.model = model;
		this.producator = producator;
		this.nrLocuri = nrLocuri;
	}
	
	
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [model=");
		builder.append(model);
		builder.append(", producator=");
		builder.append(producator);
		builder.append(", nrLocuri=");
		builder.append(nrLocuri);
		builder.append("]");
		return builder.toString();
	}



	@Override
	public void afiseazaDescriere() {
		System.out.println(this.toString());
	}
	@Override
	public void adaugaMijlocTransport(MijlocTransport mijlocTransport) throws Exception {
		throw new Exception();
	}
	@Override
	public void stergeMijlocTransport(MijlocTransport mijlocTransport) {
		// TODO Auto-generated method stub
		throw new IllegalArgumentException();
	}
	@Override
	public MijlocTransport getMijlocTransport(int index) {
		throw new IllegalArgumentException();
	}

	
}
