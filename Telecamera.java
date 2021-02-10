/**
* @author andre
 */

public abstract class Telecamera {
	
   private int numID;
   private String posizione;
   
public Telecamera(int numID, String posizione) {
	
	super();
	this.numID = numID;
	this.posizione = posizione;
	
}

public int getNumID() {
	return numID;
	
}

public String getPosizione() {
	return posizione;
	
}
@Override
public String toString() {
	return "Telecamera [numID=" + numID + ", posizione=" + posizione + "]";
}


   
}
