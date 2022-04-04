package factory_method;

public class Autobuz extends MijlocTransport {

	public Autobuz(String numarInmatriculare) {
		super(numarInmatriculare);
	}

	@Override
	public void afiseazaDescriere() {
		System.out.println("Autobuz :" + super.numarInmatriculare);
		
	}
	
	

}
