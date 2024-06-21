package br.com.service.adapter;


public class PersonAdapter implements IPersonTarget{

	private IPersonType personType;

	public PersonAdapter(IPersonType personType) {
		this.personType = personType;
	}

	@Override
	public String getDetails() {
		return personType.getDetails();
	}
	
	
}
