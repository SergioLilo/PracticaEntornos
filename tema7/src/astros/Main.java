package astros;



public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Satelites s1= new Satelites(1,1,1,1,1,1,1,"Tierra","Luna");
		Planetas p1 =new Planetas(1,1,1,1,1,1,1,"Tierra");
	
		
		p1.anadirSatelite("Luna");
		System.out.println(p1.satelite.size());
		
		for (int i = 0; i < p1.satelite.size(); i++) {
			
			if(s1.getNombre().equals(p1.getSatelite().get(i))) {
				
				p1.anadirSatelite(s1.getNombre());
				
			}
			
		}
		p1.imprimirSatelites();
	}
	
}
