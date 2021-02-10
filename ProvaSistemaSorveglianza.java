
public class ProvaSistemaSorveglianza {

	public static void main(String[] args) { 
		
		
		s1.addTelecamera(t1);
		s1.addTelecamera(t2);
		System.out.println(s1.Elenco());
		Telecamera tmp= s1.cerca(01);
		System.out.println(tmp.toString());
		boolean tmp2= s1.cancella(02);
		System.out.println(s1.Elenco());

	}

}
