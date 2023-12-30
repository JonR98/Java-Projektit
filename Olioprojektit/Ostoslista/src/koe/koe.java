package koe;

import java.util.ArrayList;
import java.util.Scanner;
public class koe {

	public static void main(String[] args) {

	
		Scanner in = new Scanner(System.in);


        ArrayList<String> ostoslista = new ArrayList<String>();
        String input;

        do {
        	int []arr = {1,2,3};
        System.out.println("Add item" + arr.length +  "(type q to quit)");
        input = in.nextLine();

        
        	
        	
        	
        
        ostoslista.add(input);

        if (input.equals("q")) {

            break;
        }



        } while (input != "q");
        
        System.out.println("Shopping cart");

        ostoslista.remove(ostoslista.size() - 1);

        for (int i = 0; i < ostoslista.size(); i++) {

            System.out.println(ostoslista.get(i));
            

        }}}
