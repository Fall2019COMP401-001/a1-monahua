package a1;

import java.util.Scanner;

import java.util.ArrayList;
import java.util.List;

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
		int[] total_items = new int[num_items];
		int[] total_customers = new int[num_items];
		String First_name = "";
		String Last_name = "";
		double[] total = new double[num_customers];
		//int num_pitem = 0;
		//String species = "";
		
		for (int j=0; j<num_customers; j++) {
			First_name = scan.next();
			Last_name = scan.next();
			int num_species = scan.nextInt();
			List<String> names_products = new ArrayList<String>();
			for (int k=0; k<num_species; k++) {
				int num_products = scan.nextInt();
				String name_products = scan.next();
				
				boolean a = false;
				if (!names_products.contains(name_products)) {
					names_products.add(name_products);
					a = true;
				}
				for (int l=0; l<num_items; l++) {
					if(name_products.equals(items[l])) {
						total_items[l] += num_products;
						if(a) {
							total_customers[l] += 1;
							
						}
					}
				}
			}	
		}	
			
		for (int i=0; i<num_items; i++) {
			if(total_customers[i] == 0) {
				System.out.println("No customers bought " + items[i]);
			}
			else {
				System.out.println(total_customers[i] + " customers bought " + total_items[i] + " " + items[i]);
			}
		}		
	}
}