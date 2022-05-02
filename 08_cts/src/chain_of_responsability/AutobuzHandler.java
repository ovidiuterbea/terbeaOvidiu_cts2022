package chain_of_responsability;

public class AutobuzHandler extends Handler {

	public AutobuzHandler(int limita) {
		super(limita);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afisareMijlocTransport(int distanta) {
		if(distanta < limita) {
			System.out.println("Se poate folosi autobuzul.");
		} else {
			super.handler.afisareMijlocTransport(distanta);
		}
	}

}
