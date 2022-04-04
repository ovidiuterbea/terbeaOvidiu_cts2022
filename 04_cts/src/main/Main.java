package main;

import builder.Autobuz;
import builder.AutobuzBuilder;
import factory_method.AutobuzFactory;
import factory_method.Factory;
import factory_method.MijlocTransport;
import factory_method.TramvaiFactory;
import factory_method.TroleibuzFactory;

public class Main {
	
	public static void afisareMijlocTransport(Factory factory,String numarInmatriculare) {
		MijlocTransport mijlocTransport = factory.getMijlocTransport(numarInmatriculare);
		mijlocTransport.afiseazaDescriere();
	}

	public static void main(String[] args) {
		// FACTORY METHOD
		afisareMijlocTransport(new AutobuzFactory(), "B-12-BBB");
		MijlocTransport troleibuz = new TroleibuzFactory().getMijlocTransport("B 333333");
		troleibuz.afiseazaDescriere();
		new TramvaiFactory().getMijlocTransport("B 123123").afiseazaDescriere();
		
		// PROTOTYPE
		
		prototype.Autobuz a1 = new prototype.Autobuz("Gigel");
		prototype.Autobuz a2 = a1.copiaza();
		a2.setNumeSofer("Mircea");
		
		System.out.println(a1.toString());
		System.out.println(a2.toString());
		
		
		// Builder
		AutobuzBuilder autobuzBuilder = new AutobuzBuilder();
		autobuzBuilder.setNumarInmatriculare("111222").setNumarLoc(7).setTextDerulat("Hello world");
		Autobuz autobuz1 = autobuzBuilder.setOpenDoors(Boolean.FALSE).setOprireCapatLinie(Boolean.TRUE).build();
		Autobuz autobuz2 = autobuzBuilder.setOpenDoors(Boolean.TRUE).build();
		System.out.println(autobuz1.toString());
		System.out.println(autobuz2.toString());
	}

}
