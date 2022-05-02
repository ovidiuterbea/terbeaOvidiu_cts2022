package main;

import chain_of_responsability.AutobuzHandler;
import chain_of_responsability.MetrouHandler;
import chain_of_responsability.TramvaiHandler;
import chain_of_responsability.TroleibuzHandler;
import memento.Autobuz;
import memento.Manager;

public class Main {

	public static void main(String[] args) {
		// chain of resp.
		AutobuzHandler autobuz = new AutobuzHandler(5);
		TroleibuzHandler troleibuz = new TroleibuzHandler(3);
		TramvaiHandler tramvai = new TramvaiHandler(10);
		MetrouHandler metrou = new MetrouHandler(100);
		
		troleibuz.setHandler(autobuz);
		autobuz.setHandler(tramvai);
		tramvai.setHandler(metrou);
		
		troleibuz.afisareMijlocTransport(7);
		autobuz.afisareMijlocTransport(20);
		troleibuz.afisareMijlocTransport(2);
		
		AutobuzHandler autobuzCluj = new AutobuzHandler(1000);
		TroleibuzHandler troleibuzCluj = new TroleibuzHandler(5);
		TramvaiHandler tramvaiCluj = new TramvaiHandler(2);
		
		tramvaiCluj.setHandler(troleibuzCluj);
		troleibuzCluj.setHandler(autobuzCluj);
		
		
		tramvaiCluj.afisareMijlocTransport(1);
		tramvaiCluj.afisareMijlocTransport(3);
		tramvaiCluj.afisareMijlocTransport(10);
		
		//memento
		Autobuz autobuzIdk = new Autobuz("Gigel",8,2000,"Mercedes");
		Manager manager = new Manager();
		
		manager.adaugaMementoAutobuz(autobuzIdk.createMemento());
		
		autobuzIdk.setNumeSofer("Adrian");
		manager.adaugaMementoAutobuz(autobuzIdk.createMemento());
		
		autobuzIdk.setConsumMediu(15);
		manager.adaugaMementoAutobuz(autobuzIdk.createMemento());
		
		System.out.println(autobuzIdk.toString());
		
		autobuzIdk.setMementoAutobuz(manager.getMementoAutobuz(0));
		System.out.println(autobuzIdk.toString());
		
		
		
		
	}

}
