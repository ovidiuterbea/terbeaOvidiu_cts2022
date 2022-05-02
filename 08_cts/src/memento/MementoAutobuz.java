package memento;

public class MementoAutobuz {
	private String numeSofer;
	private float consumMediu;
	
	public MementoAutobuz(String numeSofer, float consumMediu) {
		super();
		this.numeSofer = numeSofer;
		this.consumMediu = consumMediu;
	}
	public String getNumeSofer() {
		return numeSofer;
	}
	public void setNumeSofer(String numeSofer) {
		this.numeSofer = numeSofer;
	}
	public float getConsumMediu() {
		return consumMediu;
	}
	public void setConsumMediu(float consumMediu) {
		this.consumMediu = consumMediu;
	}
	
	
}
