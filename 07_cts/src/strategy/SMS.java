package strategy;

public class SMS implements ModPlata {

	@Override
	public void plateste(float suma) {
		// TODO Auto-generated method stub
		System.out.println("Plata cu SMS in valoare de " + suma);
	}

}
