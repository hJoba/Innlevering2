package Innlevering2;
import java.util.*;

public class Ansatt extends Kort implements Konstanter{
	private double timelonn;
	private double aarsAnsiennitet;
	
	Ansatt(String navn, int pinKode, double timelonn, double aarsAnsiennitet){
		super(navn, pinKode);
		this.timelonn = timelonn;
		this.aarsAnsiennitet = aarsAnsiennitet;
		
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

	@Override
	public void settFornavn(String fornavn) {
		this.fornavn = fornavn;
	}

	@Override
	public String hentFornavn() {
		return fornavn;
	}

	@Override
	public void settEtternavn(String etternavn) {
		this.etternavn= etternavn;
		
	}

	@Override
	public String hentEtternavn() {
		return etternavn;
	}

	@Override
	public void setFulltNavn(String fultNavn) {
		String[] s = fultNavn.split(" ");
		fornavn = s[0];
		etternavn = s[1];
		
	}

	@Override
	public String hentFulltNavn() {
		return fornavn + " " + etternavn;
	}

	@Override
	public double beregnKreditt() {
		return 1000*timelonn; 
	}

	@Override
	public double beregnBonus() {
		return 101*aarsAnsiennitet;
	}

}
