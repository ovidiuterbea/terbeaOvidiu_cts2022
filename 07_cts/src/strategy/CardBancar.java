package strategy;

public class CardBancar implements ModPlata {

	@Override
	public void plateste(float suma) {
		// TODO Auto-generated method stub
		System.out.println("Plata cu cardul in valoare de " + suma);
	}

}
