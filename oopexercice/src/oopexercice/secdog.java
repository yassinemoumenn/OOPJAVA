package oopexercice;

public class secdog {
	String name;
	
	 String aboyer (String sens ) {
		return sens;
	}
	 String manger (String qlqc ) {
		return qlqc;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		secdog dog = new secdog();
		 System.out.println("Je suis en colère. "+dog.aboyer("Ghhhhhhhhhh !!! WWWWOARF !! WWWWOARF !! - "+dog.manger("Je mange de la viande")));
	        System.out.println("Je ne suis pas du tout en colère. "+dog.aboyer("Iwiw !! awaw !!  - "+dog.manger("Je mange du poisson")));

	}

}
