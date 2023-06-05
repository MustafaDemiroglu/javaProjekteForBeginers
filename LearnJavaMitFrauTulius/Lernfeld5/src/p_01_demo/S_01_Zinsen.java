package p_01_demo;

import java.util.Scanner;

public class S_01_Zinsen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double K;
		double K1;
		double p;
		int Jahr=0;
		
		Scanner scan = new Scanner (System.in);
		System.out.println("Kapital : ");
		K= scan.nextDouble();
		K1 = K;
		System.out.println("Zinssatz : ");
		p = scan.nextDouble();
		
		scan.close();
		
		do {
			K1 = K1 * (1+p/100);
			Jahr++ ;
		} while (K1<K*2);
		
		
		System.out.println(Jahr);

	}

}
