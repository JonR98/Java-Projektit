package olio3;

import java.util.Scanner;

public class olio3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int [] t=lueLuvut();
		
		
       
	for (int i=0;i<t.length; i++) {
		System.out.print(t[i]+ " ");
	}
	
	int summa=laskeSumma(t);
	System.out.println("Summa="+summa);
	System.out.println("\nEnd of the application");
	
	}

	private static int laskeSumma(int[] t) {
		// TODO Auto-generated method stub
		int summa=0;
		for (int i=0;i<t.length;i++) {
			summa+=t[i];
		}
		
		
		return summa;
	}

	private static int[] lueLuvut() {
		// TODO Auto-generated method stub
		 Scanner sc=new Scanner(System.in);
	        int[] t=new int [5];
	        for (int i=0 ;i< t.length; i++) {
	        	System.out.print("Luku "+(i+1)+": ");
	            String s=sc.nextLine();
	            try {
	            	t[i]=Integer.parseInt(s);
	            }
	             catch(Exception e) {       
	             i--;     
	             }
		}	
	        return t;
	}
}
