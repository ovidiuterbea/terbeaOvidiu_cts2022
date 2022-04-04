package factory_method;

public class TroleibuzFactory implements Factory {

	@Override
	public MijlocTransport getMijlocTransport(String numarInmatriculare) {
		return new Troleibuz(numarInmatriculare);
	}

}
