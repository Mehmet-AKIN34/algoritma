package algoritmaprojesi;

public class ArabaTest {

	public static void main(String[] args) {
		 Araba bmw = new BMW();
	        Araba mercedes = new Mercedes();
	        Araba toyota = new Toyota();

	        System.out.println("=== BMW ===");
	        bmw.marka();
	        bmw.hizlan();
	        bmw.dur();

	        System.out.println("\n=== Mercedeş ===");
	        mercedes.marka();
	        mercedes.hizlan();
	        mercedes.dur();

	        System.out.println("\n=== Toyota ===");
	        toyota.marka();
	        toyota.hizlan();
	        toyota.dur();
	    }
	}


