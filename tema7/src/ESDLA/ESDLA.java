package ESDLA;

import java.util.ArrayList;

public class ESDLA {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<Mago> listaMagos=new ArrayList();
		listaMagos.add(new Mago("GANDALF",2,2));
		listaMagos.add(new Mago("SAURON",1,1,new Tunica("Verde","PAPEL"),new Sombrero(4,20)));
		
		for (int i = 0; i < listaMagos.size(); i++) {
			listaMagos.get(i).mostrarMago();	
		}
		
	}

}
