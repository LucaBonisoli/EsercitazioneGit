
public class TelecameraIP extends Telecamera {
	//Attributi
   private String IndirizzoIP;
   //Costruttore
   public TelecameraIP(int numID, String posizione, String indirizzoIP) {
	super(numID, posizione);
	this.IndirizzoIP = indirizzoIP;
   }
   @Override
   public String toString() {
	  return "TelecameraIP [IndirizzoIP=" + IndirizzoIP + "]" + super.toString();
   }
   
   
}
