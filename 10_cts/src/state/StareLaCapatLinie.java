package state;

public class StareLaCapatLinie implements Stare {

	@Override
	public void doAction(Autobuz autobuz) {
		if(!(autobuz.getStare() instanceof StareLaCapatLinie )) {
			System.out.println("Autobuzul este la capat de linie.");
			autobuz.setStare(this);
		} else {
			System.out.println("Autobuzul nu este la capat de linie.");
		}
		
	}

}
