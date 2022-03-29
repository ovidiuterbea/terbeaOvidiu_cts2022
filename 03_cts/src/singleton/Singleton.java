package singleton;

public class Singleton {
	private static Singleton instanta = null;
	
	private Singleton() {};
	
	public static synchronized Singleton getInstanta() {
		if(instanta == null) {
			instanta = new Singleton();
		} 
		return instanta;
	}
}

// COMPANIE DE TRANSPORT IN COMUN

// TREBUIE implementat obiecte de tipul MijlocTransport: Autobuz, Tramvai, Toleibuz.

// modulul trebuie sa ajute la creearea de obiecte de familia clase MijlocTransport.
// Tipurile de transport sunt salvate intr-un Enum(Autobuz, Tramvai, Troleibuz)
