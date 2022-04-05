package adapter;

public class ValidatorAdapter implements ValidatorSTB {
	
	private ValidatorMetrou validatorMetrou;
	
	

	public ValidatorAdapter(ValidatorMetrou validatorMetrou) {
		super();
		this.validatorMetrou = validatorMetrou;
	}

	@Override
	public void valideazaBilet() {
		// TODO Auto-generated method stub
		this.validatorMetrou.valideazaBiletMetrou();
	}

	@Override
	public void valideazaAbonament() {
		// TODO Auto-generated method stub
		this.validatorMetrou.valideazaAbonamentMetrou();
	}
	
}
