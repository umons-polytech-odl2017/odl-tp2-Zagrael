package exercise1;

public class CommissionEmployee extends Employee{
	private int salaire;
	private int commission;
	private int ventes = 0;

	// Constructeurs
	public CommissionEmployee(String n, int s, int c) {
		nom = n;
		salaire = s;
		commission = c;
	}

	// Accesseurs

	// Méthodes
	public void sell() { ventes++; }

	@Override
	public int computeSalary() {
		return salaire + ventes * commission;
	}
}
