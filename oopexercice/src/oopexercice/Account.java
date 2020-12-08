package oopexercice;

public class Account {
    String name;
    String adress;
    protected double solde;
    static void afficherInfosSolde(String name,String adress,double solde){
      System.out.println(name +" habite à "+"(" + adress+")"+"- infos solde "+ solde+" DH");
    }
    
public static void main(String[] args) {
	// TODO Auto-generated method stub
Account account = new Account();
Account.afficherInfosSolde(account.name = "El Alami Hassan",account.adress= "Safi",account.solde = 14765.8);
Account.afficherInfosSolde(account.name = "Karimi Khali",account.adress= "Casablanca",account.solde = 7654.0);
}

}