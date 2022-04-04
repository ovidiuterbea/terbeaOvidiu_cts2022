package factory_method;

public class Troleibuz extends MijlocTransport {

	public Troleibuz(String numarInmatriculare) {
		super(numarInmatriculare);
	}

	@Override
	public void afiseazaDescriere() {
		System.out.println("Troleibuz :" + super.numarInmatriculare);
	}

}
