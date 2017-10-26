package exercise1;

public class HourEmployee extends Employee {
	private int heures = 0;
	private int tauxHoraire;

	// Constructeurs
	public HourEmployee(String n, int t) {
		nom = n;
		tauxHoraire = t;
	}

	// Accesseurs

	// Méthodes
	public void workOneHour() { heures++; }

	@Override
	public int computeSalary() {
		return tauxHoraire * heures;
	}
}
