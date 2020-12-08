package oopexercice;



public class dog {
    public String name ;
    String aboyer() {
        return " dit wwaaaarf";
    }
    String manger() {
        return " Je mange de la viande";
    }
    public static void main(String[] args) {
    	dog dogs = new dog();
        System.out.println(dogs.name="Rex"+dogs.aboyer()+ dogs.manger());
        System.out.println(dogs.name="Max"+dogs.aboyer()+ dogs.manger());
    }
}


