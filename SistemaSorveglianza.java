
public class SistemaSorveglianza {
   
   private Telecamera[] vetT; 
   private int numT;
   
   public SistemaSorveglianza(int max) {
	      super();
		  this.vetT = new Telecamera[max]; 
		  this.numT=0; 
   }
   public void addTelecamera(Telecamera nuova) {
	   vetT[numT]=nuova;
	   this.numT++; 
   }
   public Telecamera cerca(int numID) {
	   for(int ind=0; ind < numT; ind ++ ) {
		   if(numID==vetT[ind].getNumID())
			   return vetT[ind];
	   }
	   return null;
   }
   public Boolean cancella(int numID) {
	   for(int ind=0; ind < numT; ind ++ ) {
		   if(numID==vetT[ind].getNumID()) {
			  vetT[ind]=vetT[numT-1];
			  numT--;
			  return true;
		   }
	   }
	   return false;
   }
   public String Elenco() {
	   String tmp="";
	   for(int ind=0; ind < numT; ind ++ ) {
		   tmp+= vetT[ind].toString()+ "\n";
	   }
	   return tmp;
   }
}
