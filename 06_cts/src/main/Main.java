package main;

import composite.Autobuz;
import composite.Grup;
import composite.MijlocTransport;
import decorator.Decorator;
import decorator.PrinterBilet;
import decorator.PrinterBiletConcret;
import decorator.PrinterBiletCustomizat;
import decorator.PrinterMesajPaste;
import proxy.*;

public class Main {

	public static void main(String[] args){
		// composite
		MijlocTransport a1 = new Autobuz("STB","MERCEDES",10);
		MijlocTransport a2 = new Autobuz("RATB","OTOKAR",10);
		MijlocTransport a3 = new Autobuz("PTB","AUDI",40);
		
		MijlocTransport g1 = new Grup("Mici");
		MijlocTransport g2 = new Grup("Medie");
		MijlocTransport g3 = new Grup("Flota");
		
		try {
			g3.adaugaMijlocTransport(g2);
			g3.adaugaMijlocTransport(g1);
			
			g1.adaugaMijlocTransport(a1);
			g1.adaugaMijlocTransport(a2);
			g2.adaugaMijlocTransport(a3);
			g3.afiseazaDescriere();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		// decorator
		PrinterBilet printerBilet = new PrinterBiletConcret("1/12/2022", 10);
		printerBilet.afiseazaDescriere();
		
		
		Decorator decorator = new PrinterBiletCustomizat(printerBilet);
		decorator.afiseazaDescriere();
		decorator.afiseazaVerso();
		
		PrinterBilet bilet2 = new PrinterBiletConcret("17/04/2022", 5);
		bilet2.afiseazaDescriere();
		
		Decorator decoratorPaste = new PrinterMesajPaste(bilet2);
		decoratorPaste.afiseazaDescriere();
		decoratorPaste.afiseazaVerso();
		
		// proxy
		proxy.Autobuz autobuz =  new proxy.Autobuz(5, 434);
		autobuz.opresteInStatie();
		
		autobuz.setNrCalatori(0);
		autobuz.opresteInStatie();
		
		proxy.AutobuzDeNoapte autobuzNoapte = new proxy.AutobuzDeNoapte(autobuz);
		autobuzNoapte.setNrCalatori(0);
		autobuzNoapte.opresteInStatie();
	}

}
