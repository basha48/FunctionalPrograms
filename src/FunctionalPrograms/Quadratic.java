package FunctionalPrograms;

import java.util.Scanner;

import Utility.Utilityfunctions;

public class Quadratic {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter any Three Numbers : ");
		
		int A=	sc.nextInt();
		int B= sc.nextInt();
		int C= sc.nextInt();
		int SquareofB=Utilityfunctions.power(B, 2);
		
		double delta= (double) SquareofB -4 * A * C ;
		System.out.println("delta is  : " +delta);
		
		double Root1=(double) (-B + Utilityfunctions.power((int)delta, 2) ) / (2 * A);
		
		double Root2=(double) (-B - Utilityfunctions.power((int)delta, 2) ) / (2 * A);
		System.out.println("Root one is :" +Root1);
		System.out.println("Root Two is :" +Root2);
	}

}
