package olio2;

import java.util.Scanner;

public class olio2 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		int nro=1;
		int summa=0;
		while (true) {
	System.out.print("Luku: "+nro+" please");
	String s=sc.nextLine();
	try {
	summa=summa+Integer.parseInt(s);
	}
	catch(Exception e) {
		if (s.length()>0 && s.charAt(0) =='x') {
		break;
	}
		continue;
	}
	System.out.println("Keskiarvo=" + (summa/(float)nro));
	nro++;
		
		
		
		
		
		
		
		}
	}

}