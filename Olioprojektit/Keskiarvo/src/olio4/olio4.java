package olio4;

import java.util.Scanner;

public class olio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        int [] vari=new int[5];
        lueluvut(vari);
        float ka = laskekeskiarvo(vari);
        System.out.println("Keskiarvo=" +ka);
	}
	
	private static float laskekeskiarvo(int[] vari) {
		int summa=0;
		for (int i=0;i<vari.length;i++) {
			summa=summa+vari[i];
		}
		float ka=(float)summa/vari.length;
		
		return ka;
	}

	private static void lueluvut(int[] vari) {
		Scanner sc=new Scanner(System.in);
		for (int i=0;i<vari.length;i++) {
			System.out.print("Anna Luku: ");
			String s=sc.nextLine();
			try {
			vari[i]=Integer.parseInt(s);
			}
			catch (Exception e) {
				i--;
			}
			
		}
        
		
		
		
		
	}
}