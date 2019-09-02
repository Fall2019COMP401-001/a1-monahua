package a1;

import java.util.Scanner;

public class A1Jedi {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int num_items = scan.nextInt();
		String[] items = new String[num_items];
		for (int i=0; i<num_items; i++) {			
			items[i] = scan.next();
			scan.nextDouble();
			//System.out.println(items[i]);
		}
		int num_customers = scan.nextInt(); 
		int[] num_species = new int[num_items];
		int[] num_people = new int[num_items];
		String First_name = "";
		String Last_name = "";
		int num_pitem = 0;
		String species = "";
		
		for (int j=0; j<num_customers; j++) {
			First_name = scan.next();
			Last_name = scan.next();
			num_species = scan.nextInt();
			
			for (int k=0; k<num_species; k++) {
				num_pitem = scan.nextInt();
				species = scan.next();
				
				
				}
				
			}
		}
	}
}