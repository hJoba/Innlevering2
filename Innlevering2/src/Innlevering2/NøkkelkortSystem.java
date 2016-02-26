package Innlevering2;

import java.util.ArrayList;

public class N�kkelkortSystem {

	public static void main(String[] args) {
		ArrayList<Kort> kortArray = new ArrayList<>();
		
		Kort k1 = new Ansatt("Ole Olsen", 1234);
		Kort k2 = new Gjest("Marit Olsen");
		
		kortArray.add(k1); 
		kortArray.add(k2);
		
		for (Kort kort : kortArray) { 
			System.out.println(kort);
			System.out.println("Kode 1234 er " + (kort.checkPIN(1234) ? "gyldig": "ugyldig")); 
			System.out.println("Kode 9999 er " + (kort.checkPIN(9999) ? "gyldig": "ugyldig")); 
			
			}

	}

}
