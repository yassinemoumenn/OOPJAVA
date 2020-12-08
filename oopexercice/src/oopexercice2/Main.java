package oopexercice2;

public class Main {
    public static void main(String[] args) {
        System.out.println("");
        System.out.println();
        Account2 Hassan = new Account2("El Alami Hassan","Safi",14765.8);

        Hassan.afficherInfosSolde();
        Hassan.calculerInterer();

        System.out.println();
        System.out.println("");
        System.out.println();

        Account2 Khalid = new Account2("Karimi Khalid","Casablanca",7654.0);

        Khalid.afficherInfosSolde();
        Khalid.calculerInterer();


    }
}
