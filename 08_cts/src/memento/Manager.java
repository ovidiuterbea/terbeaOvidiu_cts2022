package memento;

import java.util.ArrayList;
import java.util.List;

public class Manager {
	private List<MementoAutobuz> lista;

	public Manager() {
		super();
		this.lista = new ArrayList<>();
	}
	
	public void adaugaMementoAutobuz(MementoAutobuz autobuz) {
		this.lista.add(autobuz);
	}
	
	public MementoAutobuz getMementoAutobuz(int index) {
		return this.lista.get(index);
	}
	
	
}
