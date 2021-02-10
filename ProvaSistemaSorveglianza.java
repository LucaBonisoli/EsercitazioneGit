
public class ProvaSistemaSorveglianza {

	public static void main(String[] args) { 
		
		
		s1.addTelecamera(t1);
		s1.addTelecamera(t2);
		System.out.println(s1.Elenco());
		Telecamera tmp= s1.cerca(01);
		System.out.println(tmp.toString());
		boolean tmp2= s1.cancella(02);
		System.out.println(s1.Elenco());
		
		TelecameraIP t1= new TelecameraIP(01,"cucina","103.40.30");
		TelecameraTVCC t2= new TelecameraTVCC(02,"Ingresso", 20);
		SistemaSorveglianza s1= new SistemaSorveglianza(10);
	}

}
