
public class main {
	public static void main (String[] args) {
		Account5 khalid = new Account5();
		khalid.setNom("Karimi Khalid  ");
		khalid.setAdresse("Casablanca");
		khalid.setSolde(7654.0);

		System.out.println("Nom: " + khalid.getNom());
		System.out.println("Adresse: " + khalid.getAdresse());
		System.out.println("Solde: " + khalid.getSolde());
	}
}
