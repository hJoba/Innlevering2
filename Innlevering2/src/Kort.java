
public abstract class Kort {
	private String etterNavn;
	private String forNavn;
	private int pinKode;
	private int kortNummer;
	private boolean sperretKort;
	
	private static int id = 10000;
	
	Kort (String etterNavn, String forNavn,int pinKode){
		this.etterNavn = etterNavn;
		this.forNavn =forNavn;
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
		return forNavn + " " + etterNavn + "/n" + kortNummer + "/n" + pinKode + "/n"  + sperretKort;
	}
	public abstract boolean sjekkPIN(int pin);
		/*if (pin==pinKode)
			return true;
		else 
		return false; */
	
	
	
	
}
