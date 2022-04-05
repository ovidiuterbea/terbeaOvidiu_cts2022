package main;
import adapter.*;
import facade.Facade;
import builderv2.Autobuz;
import builderv2.AutobuzBuilder;

public class Main {

	public static void main(String[] args) {
		// adapter
		ValidatorScanare validatorScanare = new ValidatorScanare();
		ValidatorAdapter adapter = new ValidatorAdapter(validatorScanare);
		adapter.valideazaAbonament();
		adapter.valideazaBilet();
		System.out.println();
		
		// facade
		Facade facade = new Facade();
		facade.deschideAll();
		facade.inchideAll();
		
		// builder v2
		AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
		autobuzBuilder.setDeschideUsi(Boolean.TRUE).setModel("Mercedes").setNumarInmatriculare(1111111);
		Autobuz autobuz = autobuzBuilder.build();
		System.out.println(autobuz.toString());
	}

}
