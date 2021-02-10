
public class TelecameraTVCC extends Telecamera {
   //Attributi
	private int distanza;
	//Costruttore
    public TelecameraTVCC(int numID, String posizione, int distanza) {
	  super(numID, posizione);
	  this.distanza = distanza;
    }
	public void setDistanza(int distanza) {
		this.distanza = distanza;
	}
	public int getDistanza() {
		return distanza;
	}
	@Override
	public String toString() {
		return "TelecameraTVCC [distanza=" + distanza + "]"+ super.toString();
	}
	
    
	
}
