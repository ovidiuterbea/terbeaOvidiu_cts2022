package factory_method;

public class Tramvai extends MijlocTransport {

	public Tramvai(String numarInmatriculare) {
		super(numarInmatriculare);
	}

	@Override
	public void afiseazaDescriere() {
		System.out.println("Tramvai :" + super.numarInmatriculare);
	}

}
