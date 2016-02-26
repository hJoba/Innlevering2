package Innlevering2;

public abstract class Kort implements Comparable<Kort>, Cloneable {
	protected String etternavn;
	protected String fornavn;
	protected int pinKode;
	private int kortNummer;
	protected boolean sperretKort;
	
	private static int id = 10000;
	
	Kort (String navn ,int pinKode){
		String[] s = navn.split(" ");
		this.etternavn = s[1];
		this.fornavn =s[0];
		this.pinKode = pinKode;
		id+=1;
		kortNummer=id;
		this.sperretKort = false;
		
	}
	
	public String getNavn(){
		return fornavn + " " + etternavn;
		}
	
	public boolean isSperret(){
		return sperretKort;
	}
	
	public String toString(){
		return fornavn + " " + etternavn + "\n" + kortNummer + "\n" + pinKode + "\n"  + sperretKort;
	}
	public abstract boolean checkPIN(int pin);
		/*if (pin==pinKode)
			return true;
		else 
		return false; */
	

	
	
	
	
}
