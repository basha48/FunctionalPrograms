package Utility;

public class Utilityfunctions {
	
	
	public static int power(int a , int b ) {
	
	int X=(int) Math.pow(a,b);
	
	return X;
	}
	
	
	public static double Fahrenheit(int celcius  ) {
		
		  double Temparature =( celcius * 18) + 32;
		
		return Temparature;
		}
	
	public static double milesperhour(int KmPerHr  ) {
		
		  double MilesPerHour =( KmPerHr / 1.609344) ;
		
		return MilesPerHour;
		}
	
	
	
	
}
