package composite;

import java.util.ArrayList;
import java.util.List;

public class Grup implements MijlocTransport {
	private List<MijlocTransport> optiuni;
	private String denumire;
	
	public Grup(String denumire) {
		super();
		this.denumire = denumire;
		this.optiuni = new ArrayList<MijlocTransport>();
	}
	
	@Override
	public void afiseazaDescriere() {
		System.out.println(this.denumire);
		for(MijlocTransport optiune : optiuni) {
			optiune.afiseazaDescriere();
		}
	}
	@Override
	public void adaugaMijlocTransport(MijlocTransport mijlocTransport) throws Exception {
		optiuni.add(mijlocTransport);
	}
	@Override
	public void stergeMijlocTransport(MijlocTransport mijlocTransport) {
		optiuni.remove(mijlocTransport);
	}
	@Override
	public MijlocTransport getMijlocTransport(int index) {
		return optiuni.get(index);
	}
}
