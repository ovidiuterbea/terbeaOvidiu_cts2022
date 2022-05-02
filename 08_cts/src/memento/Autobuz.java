package memento;

public class Autobuz {
	private String numeSofer;
	private float consumMediu;
	private int anFabricatie;
	private String model;
	public Autobuz(String numeSofer, float consumMediu, int anFabricatie, String model) {
		super();
		this.numeSofer = numeSofer;
		this.consumMediu = consumMediu;
		this.anFabricatie = anFabricatie;
		this.model = model;
	}
	
	public void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}

	public void setConsumMediu(float consumMediu) {
		this.consumMediu = consumMediu;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Autobuz [numeSofer=");
		builder.append(numeSofer);
		builder.append(", consumMediu=");
		builder.append(consumMediu);
		builder.append(", anFabricatie=");
		builder.append(anFabricatie);
		builder.append(", model=");
		builder.append(model);
		builder.append("]");
		return builder.toString();
	}
	
	public void setMementoAutobuz(MementoAutobuz mementoAutobuz) {
		this.numeSofer = mementoAutobuz.getNumeSofer();
		this.consumMediu = mementoAutobuz.getConsumMediu();
	}
	
	public MementoAutobuz createMemento() {
		MementoAutobuz autobuz = new MementoAutobuz(this.numeSofer,this.consumMediu);
		return autobuz;
	}
	
}
