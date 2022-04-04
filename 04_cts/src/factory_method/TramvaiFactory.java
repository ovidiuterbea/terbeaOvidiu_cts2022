package factory_method;

public class TramvaiFactory implements Factory {

	@Override
	public MijlocTransport getMijlocTransport(String numarInmatriculare) {
		return new Tramvai(numarInmatriculare);
	}

}
