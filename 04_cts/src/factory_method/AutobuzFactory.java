package factory_method;

public class AutobuzFactory implements Factory {

	@Override
	public MijlocTransport getMijlocTransport(String numarInmatriculare) {
		return new Autobuz(numarInmatriculare);
	}

}
