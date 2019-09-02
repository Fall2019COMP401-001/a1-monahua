package a1;

import java.util.Scanner;

public class A1Novice {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		// Your code follows here.
		int num_ppl = scan.nextInt();
		String[] values = new String[num_ppl];
		for (int i=0; i<num_ppl; i++) {
			String first_name = scan.next();
			String last_name = scan.next(); 
			int num_total = scan.nextInt();
			//int[] num_items = new int[num_total];
			//int[] num_price = new int[num_total];
			double sum = 0.0;
			for (int a=0; a<num_total; a++) {
				int num_items = scan.nextInt();
				scan.next();
				double num_price = scan.nextDouble();
				sum += num_items * num_price;
				}
			System.out.println(first_name.substring(0,1)+ ". "+ last_name + ": " + String.format("%.2f", sum));
		}
		
	}
}
