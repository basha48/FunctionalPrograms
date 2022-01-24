package FunctionalPrograms;

import java.util.Scanner;

import Utility.Utilityfunctions;

public class Distanceproblem {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter any two Numbers  to calculate distance: ");
		
	int X=	sc.nextInt();
	int Y= sc.nextInt();
	
	 int DistanceOfX=Utilityfunctions.power(X, 2);
	 int DistanceOfY=Utilityfunctions.power(Y, 2);
	
	 int Total =DistanceOfX + DistanceOfY;
	 
	 System.out.print("Total distance is: "  +Total);
		

	}

}
