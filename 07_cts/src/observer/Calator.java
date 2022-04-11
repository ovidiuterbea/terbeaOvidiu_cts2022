package observer;

public class Calator implements ICalator {
	
	private String nume;
	
	

	public Calator(String nume) {
		super();
		this.nume = nume;
	}



	@Override
	public void primesteMesaj(String mesaj) {
		System.out.println(nume +" a primit mesajul " + mesaj);
	}

}
