import java.util.Random;

public class Turven {

	final static int MaxOgen = 18;
	final static int MaxWorpen = 200;
	final static int MaxOgenInArray = MaxOgen + 1;
	final static int AantalDobbelstenen = 3;
	final static int[] AantalKeer = new int[MaxOgenInArray];

	public static void main(String[] args) {

		gooi();
		print();
		

	}

	public static void gooi() {

		Random generator = new Random();
		int aantalWorpen = 0;
		int totaalWorp = 0;
		while (aantalWorpen <= MaxWorpen) {

			for (int dobbelstenen = 0; dobbelstenen < AantalDobbelstenen; dobbelstenen++) {
				int worp = (generator.nextInt(6) + 1);
				totaalWorp =+ worp;
			}
			AantalKeer[totaalWorp]++;
			totaalWorp = 0;
		}

	}

	public static void print() {
		for (int aantalOgen = 3; aantalOgen <= MaxOgen; aantalOgen++) {
			int totaalWaarde = 0;
			String stringOgen = aantalOgen + " :";
			while (totaalWaarde < AantalKeer[aantalOgen]) {
				stringOgen = stringOgen + " X "; 
				totaalWaarde++;
			}
			System.out.println(stringOgen); 
			
			// hij print nu helemaal niks meer uit, waarom???
		}
	}
}
