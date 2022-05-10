package state;

public class StareInCursa implements Stare {

	@Override
	public void doAction(Autobuz autobuz) {
		if(autobuz.getStare() instanceof StareLaCapatLinie) {
			System.out.println("Autobuzul pleaca in cursa.");
			autobuz.setStare(this);
		} else {
			System.out.println("Autobuzul nu poate sa plece in cursa.");
		}
	}

}
