package app;

import data.Muki;

public class Mukihylly {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Muki m=new Muki();
		m.setId(101);
		m.setTilavuus(2.5f);
		m.setValmistaja("Duralex");
		
		Muki iso=new Muki(1500);
		
		Muki vesilasi=new Muki(102, 
				2, "Iittala");
		
		System.out.println("Vesilasi"+
				vesilasi.getValmistaja());
	}

}
