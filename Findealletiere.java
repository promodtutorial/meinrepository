
public class Findealletiere {
	
	public static void main(String args[]) {
		
		Tiere [] tl = new Tiere [2];
		
		Katze k  = new Katze();
		k.setFell("grau gestreift");
		
		Hund h = new Hund();
		h.setFell("schwarz");
		
		tl[0] = k;
		tl[1] = h;
		System.out.println( tl[0].getFell() );
		System.out.println( tl[1].getFell() ); 
}
}