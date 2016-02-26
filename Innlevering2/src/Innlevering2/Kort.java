package Innlevering2;

public abstract class Kort {
	private String etterNavn;
	private String forNavn;
	protected int pinKode;
	private int kortNummer;
	protected boolean sperretKort;
	
	private static int id = 10000;
	
	Kort (String navn ,int pinKode){
		String[] s = navn.split(" ");
		this.etterNavn = s[1];
		this.forNavn =s[0];
		this.pinKode = pinKode;
		id+=1;
		kortNummer=id;
		this.sperretKort = false;
		
	}
	
	public String getNavn(){
		return forNavn + " " + etterNavn;
		}
	
	public boolean isSperret(){
		return sperretKort;
	}
	
	public String toString(){
		return forNavn + " " + etterNavn + "\n" + kortNummer + "\n" + pinKode + "\n"  + sperretKort;
	}
	public abstract boolean checkPIN(int pin);
		/*if (pin==pinKode)
			return true;
		else 
		return false; */
	
	
	
	
}
