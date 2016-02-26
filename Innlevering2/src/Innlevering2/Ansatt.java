package Innlevering2;
import java.util.*;

public class Ansatt extends Kort {
	
	Ansatt(String navn, int pinKode){
		super(navn, pinKode);
		
	}

	@Override
	public boolean checkPIN(int pin) {
		GregorianCalendar sjekkTid = new GregorianCalendar();
		int s = sjekkTid.get(Calendar.HOUR_OF_DAY);
		
		if(s>6 && s<17 && sperretKort==false)
			return true;
		else if (pin==pinKode && sperretKort==false)
			return true;
		else 
			return false;
	}

}
