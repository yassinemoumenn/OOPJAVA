package oop6;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 
		        Account6 khalid = new Account6();
		        khalid.setNom("khalid KARIMI");
		        khalid.setAdresse("Casablanca");
		        khalid.setSolde(7654);
		        //Output
		        System.out.println("Nom: " + khalid.getNom());
		        System.out.println("Adresse: " + khalid.getAdresse());
		        System.out.println("Solde: " + khalid.getSolde() + "DH");
		        khalid.retirer();
		    }
	}

