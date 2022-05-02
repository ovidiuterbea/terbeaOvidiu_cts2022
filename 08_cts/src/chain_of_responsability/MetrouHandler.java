package chain_of_responsability;

public class MetrouHandler extends Handler {

	public MetrouHandler(int limita) {
		super(limita);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afisareMijlocTransport(int distanta) {
		if(distanta < limita) {
			System.out.println("Se poate folosi metroul.");
		} else {
			super.handler.afisareMijlocTransport(distanta);
		}
	}

}
