package chain_of_responsability;

public class TroleibuzHandler extends Handler {

	public TroleibuzHandler(int limita) {
		super(limita);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void afisareMijlocTransport(int distanta) {
		if(distanta < limita) {
			System.out.println("Se poate folosi troleibuzul.");
		} else {
			super.handler.afisareMijlocTransport(distanta);
		}
	}

}
