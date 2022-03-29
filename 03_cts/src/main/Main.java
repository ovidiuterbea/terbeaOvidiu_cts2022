package main;

import singleton.Singleton;
import simple_factory.*;

public class Main {

	public static void main(String[] args) {
		// SINGLETON
		Singleton s1 = Singleton.getInstanta();
		Singleton s2 = Singleton.getInstanta();
		System.out.println(s1);
		System.out.println(s2);
		
		
		 // SIMPLE FACTORY
        MijlocTransport autobuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Autobuz,"B100CCC");
        MijlocTransport tramvai = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Tramvai,"B101CCD");
        MijlocTransport troleibuz = FabricaMijlocTransport.getMijlocTransport(TipMijlocTransport.Troleibuz,"B300VCC");

        System.out.println(autobuz.toString());
        System.out.println(tramvai.toString());
        System.out.println(troleibuz.toString());

	}

}
