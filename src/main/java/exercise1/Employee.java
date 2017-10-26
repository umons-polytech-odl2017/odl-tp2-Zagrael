package exercise1;

public abstract class Employee {
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

