package adapter;

public class ValidatorScanare implements ValidatorMetrou {

	@Override
	public void valideazaBiletMetrou() {
		// TODO Auto-generated method stub
		System.out.println("Biletul de metrou a fost validat.");
	}

	@Override
	public void valideazaAbonamentMetrou() {
		// TODO Auto-generated method stub
		System.out.println("Abonamentul de metrou a fost validat");
	}

	@Override
	public void valideazaBiletCalatorii() {
		// TODO Auto-generated method stub
		System.out.println("Cele doua bilete de metrou au fost validate.");
	}

}
