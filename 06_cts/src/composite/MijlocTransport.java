package composite;

public interface MijlocTransport {
	public void afiseazaDescriere();
	public void adaugaMijlocTransport(MijlocTransport mijlocTransport) throws Exception;
	public void stergeMijlocTransport(MijlocTransport mijlocTransport);
	public MijlocTransport getMijlocTransport(int index);
}
