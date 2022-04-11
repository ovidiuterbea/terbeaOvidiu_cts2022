package main;

import flyweight.Autobuz;
import flyweight.AutobuzLinie;
import flyweight.FlyweightFactory;
import observer.Calator;
import observer.ICalator;
import observer.MijlocTransport;
import strategy.SMS;
import strategy.Validator;

public class Main {

	public static void main(String[] args) {
		
		// flyweight
		AutobuzLinie a1 = new Autobuz("Mercedes",2000,80);
		AutobuzLinie a2 = new Autobuz("Otokar",1990,80);
		AutobuzLinie a3 = new Autobuz("Audi",2005,80);
		AutobuzLinie a4 = new Autobuz("Mercedes",2010,50);
		AutobuzLinie a5 = new Autobuz("Fiat",2020,40);
		
		FlyweightFactory flyweightFactory = new FlyweightFactory();
		
		a1.descrie(flyweightFactory.getLinie(168));
		a2.descrie(flyweightFactory.getLinie(226));
		a3.descrie(flyweightFactory.getLinie(168));
		a4.descrie(flyweightFactory.getLinie(137));
		
		//strategy
		Validator validator = new Validator(10);
		validator.ValidareCalatorie();
		validator.setModPlata(new SMS());
		validator.ValidareCalatorie();
		
		//observer
		MijlocTransport mijlocTransport = new MijlocTransport(0);
		ICalator c1 = new Calator("Ovidiu");
		ICalator c2 = new Calator("Andreea");
		ICalator c3 = new Calator("Dorel");
		
		mijlocTransport.adaugaCalator(c1);
		mijlocTransport.adaugaCalator(c2);
		
		mijlocTransport.trimiteMesajPlecareCapatLinie();
		
		mijlocTransport.stergeCalator(c1);
		mijlocTransport.adaugaCalator(c3);
		
		mijlocTransport.trimiteMesajPlecareCapatLinie();
		
	}

}
