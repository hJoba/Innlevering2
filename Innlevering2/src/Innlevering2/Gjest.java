package Innlevering2;
import java.util.*;

public class Gjest extends Kort {
	
	
	private GregorianCalendar utgaar;
	
	
	Gjest (String navn){
		super(navn ,9999);
		utgaar = new GregorianCalendar();
		utgaar.add(Calendar.DATE, 7);
	}
	
	

	@Override
	public boolean checkPIN(int pin) {
		GregorianCalendar sjekkTid = new GregorianCalendar();
		if (pin==pinKode && sjekkTid.before(utgaar) && sperretKort==false)
			return true;
		else 
			return false;
	}
}
