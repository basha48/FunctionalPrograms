package FunctionalPrograms;

import java.util.Scanner;

import Utility.Utilityfunctions;

public class WindChill {
	
	public static void main(String[] args) {
	
	Scanner sc =new Scanner(System.in);   
	System.out.print("Enter Temparature  and speed : ");
	
	int Temparature=sc.nextInt();
	int Speed= sc.nextInt();
	
	  double t= Utilityfunctions.Fahrenheit( Temparature );
	   Utilityfunctions.milesperhour(Speed);
	
	   double EffectiveTemperature =35.74 + (0.6215 * t) + (0.4275 * t -35.75) * Utilityfunctions.power(Speed, (int)0.16) ;
	
	   System.out.print("Effective Temperature is : " +EffectiveTemperature);
}
}
