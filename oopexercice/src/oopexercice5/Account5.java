package oopexercice5;

	public class Account5 {

	    private String nom;
	    private String adresse;
	    private double solde;
	    
	    public String getNom(){
            return nom;
        }
        public String getAdresse(){
            return adresse;
        }
        public double getSolde(){
            return solde;
        }
//        setter
        public void setNom(String newNom){
            this.nom = newNom;
        }
        public void setAdresse(String newAdresse){
            this.adresse = newAdresse;
        }
        public void setSolde(double newSolde){
            this.solde = newSolde;
        }
}
