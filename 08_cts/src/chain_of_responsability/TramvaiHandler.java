package chain_of_responsability;

public class TramvaiHandler extends Handler {

	public TramvaiHandler(int limita) {
		super(limita);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afisareMijlocTransport(int distanta) {
		if(distanta < limita) {
			System.out.println("Se poate folosi tramvaiul.");
		} else {
			super.handler.afisareMijlocTransport(distanta);
		}
	}

}
