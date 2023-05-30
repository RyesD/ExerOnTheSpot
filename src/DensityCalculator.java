import java.util.Scanner;

public class DensityCalculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.print("pls choose which one to Compute \n\n[A] Density,  [B] Mass,  [C] Volume \n\nInput : ");
		char i =input.next().charAt(0);
			
		
		switch (i){ 
		
		case 'a':
			
			System.out.print("\nEnter the amount of Mass : ");
			double Mass = input.nextDouble();
			
			System.out.print("\nEnter the amount of Volume : ");
			double Volume = input.nextDouble();
			
			
			double Density = Mass / Volume ;
			
			System.out.print("\nDensity: " + Density + " kilogram / cubic meter" );
			if(Density >=1 ) {
				System.out.println("the object will not float in the water ");
				
			}
			else {
				System.out.println("the object will float in the water ");
			}
			
			break;
			
case 'b':
			
			System.out.print("\nEnter the amount of Density : ");
			double Den = input.nextDouble();
			
			System.out.print("\nEnter the amount of Volume : ");
			double Vol = input.nextDouble();
			
			
			double mass = Den * Vol ;
			
			System.out.print("\nMass: " + mass + " kilogram" );
			
			break;
			
			
case 'c':
	
	System.out.print("\nEnter the amount of Mass : ");
	double m = input.nextDouble();
	
	System.out.print("\nEnter the amount of Density : ");
	double d = input.nextDouble();
	
	
	double v = m / d ;
	
	System.out.print("\nVolume: " + v + " cubic meter");
	
	break;
	
default:
	System.out.print("error" );
	
		}
		
		
	}

}
