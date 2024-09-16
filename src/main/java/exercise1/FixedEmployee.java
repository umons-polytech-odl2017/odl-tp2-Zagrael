package exercise1;

public class FixedEmployee extends Employee {
	private int salaire;

	// Constructeurs
	public FixedEmployee(String n, int s) {
		nom = n;
		salaire = s;
	}

	// Accesseurs

	// Méthodes
	@Override
	public int computeSalary() {
		return salaire;
	}
}
