package ro.ase.dice.clase;

public class Elefant extends Animal {

	public Elefant(String nume) {
		super(nume);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void mananca(String mancare) {
		// TODO Auto-generated method stub
		System.out.println("Elefantul "+this.getNume()+ " mananca "+ mancare);
	}

}
