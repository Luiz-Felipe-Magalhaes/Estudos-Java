package cursoUdemy.lista6;

public class LacoForEach {

	public static void main(String[] args) {
		
		String[] vect = new String[] {"Maria", "Bob", "Alex"};
		
		for (int i=0; i< vect.length; i++) {
		System.out.println(vect[i]);
		}
		for (String BATATA : vect) {
		System.out.println(BATATA);
		}


	}

}
