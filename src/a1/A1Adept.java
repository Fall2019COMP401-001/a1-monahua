package a1;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class A1Adept {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		Map<String, Double> foodMap = new HashMap<String, Double>();
		
		
		// Your code follows here.
		int num_items = scan.nextInt();
	//	String[] values = new String[num_items];
		
		for (int i=0; i<num_items; i++) {			
			String items = scan.next();
			double price = scan.nextDouble();
			foodMap.put(items, price);			
		}
		int num_customers = scan.nextInt();
//		Map<String, Double> nameMap = new HashMap<String, Double>();
		String[] names=new String[num_customers];
		double[] sum_total = new double [num_customers];
		double sumsum = 0.0;
		for (int j=0; j<num_customers; j++) {
			String name_customers = scan.next();
			name_customers+=" ";
			name_customers+=scan.next();
			names[j]=name_customers;
			int num_species = scan.nextInt();
			double sum = 0.0;
	        for (int k=0; k<num_species; k++) {
	        	int num = scan.nextInt();
	        	double price = foodMap.get(scan.next());
	        	sum += num * price;
	        }
	  //      nameMap.put(name_customers, sum);
	        
	        sum_total[j]=sum;
	        sumsum+=sum_total[j];
		}
		int min = findValueMin(sum_total);
		int max = findValueMax(sum_total);
		double average= sumsum / num_customers;
		System.out.println("Biggest: "+ names[max]+" ("+ String.format("%.2f",sum_total[max]) +")");
		System.out.println("Smallest: "+ names[min]+" ("+String.format("%.2f",sum_total[min]) +")");
		System.out.println("Average: "+ String.format("%.2f",average));
	}
	
	static int findValueMin(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_min = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] < cur_min) {
				cur_min = vals[i];
			}
		}
		int index=0;
		for (int j=0; j< vals.length; j++) {
			if(vals[j]==cur_min) {
				index=j;
				break;
			}
		}
				
		return index;
		
	}
    static int findValueMax(double[] vals) {
		
		// Initialize current minimum to first value in array.
		double cur_max = vals[0];
		
		// Starting with second value (if any), compare each value
		// in array with current minimum and replace if smaller.
		
		for (int i=1; i < vals.length; i++) {
			if (vals[i] > cur_max) {
				cur_max = vals[i];
			}
		}
		int index=0;
		for (int j=0; j< vals.length; j++) {
			if(vals[j]==cur_max) {
				index=j;
				break;
			}
		}
		return index;
	}

	
}
