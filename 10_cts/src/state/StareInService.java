package state;

public class StareInService implements Stare {

	@Override
	public void doAction(Autobuz autobuz) {
		if(autobuz.getStare() instanceof StareLaCapatLinie) {
			System.out.println("Autobuzul intra in service.");
			autobuz.setStare(this);
		} else {
			System.out.println("Autobuzul nu poate intra in service.");
		}
		
	}

}
