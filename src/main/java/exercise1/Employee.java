package exercise1;

import exercise2.Payable;

public abstract class Employee implements Payable {
	protected String nom;

	// Constructeurs

	// Accesseurs
	public String getName() {
		return nom;
	}

	// Méthodes
	public abstract int computeSalary();

	public void sell() {}

	public void workOneHour() {}

}

