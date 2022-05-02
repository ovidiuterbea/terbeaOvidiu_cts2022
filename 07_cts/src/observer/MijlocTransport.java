package observer;

import java.util.ArrayList;
import java.util.List;

public class MijlocTransport {
	private List<ICalator> calatori;
	private int nrLinie;
	
	public MijlocTransport(int nrLinie) {
		super();
		this.calatori = new ArrayList<ICalator>();
		this.nrLinie = nrLinie;
	}
	
	public void adaugaCalator(ICalator calator) {
		this.calatori.add(calator);
	}
	
	public void stergeCalator(ICalator calator) {
		this.calatori.remove(calator);
	}
	
	public void trimiteMesaj(String mesaj) {
		for(ICalator calator : calatori) {
			calator.primesteMesaj(mesaj);
		}
	}
	
	public void trimiteMesajPlecareCapatLinie() {
		trimiteMesaj("Am plecat de la capatul de linie cu numarul " + this.nrLinie);
	}
	
	
}
