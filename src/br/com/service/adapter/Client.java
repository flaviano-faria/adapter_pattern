package br.com.service.adapter;

public class Client {
	
	public static void main(String[] args) {
		IPersonTarget person = new PersonAdapter(new NaturalPerson());
		System.out.println(person.getDetails());
		
		IPersonTarget legalPerson = new PersonAdapter(new LegalPerson());
		System.out.println(legalPerson.getDetails());
	}

}
