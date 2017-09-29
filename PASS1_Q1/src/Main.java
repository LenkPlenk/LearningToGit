// Author: Leon Kalish
// File Name: PASS01-Q1
// Project Name: PASS01
// Creation Date: September 29 2017
// Modified Date: September 29 2017
/* Description: This program is built to demonstrate to a programmer how to properly document their
*/

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
			int rectHeight;
			int rectLength;
			int rectWidth;
			int rectVolume; 
			double cylinderVolume;
			int cylinderRadius;
			int cylinderHeight;
			double popcornVolume;
			double popcornRadius = 1.5;
			int popcornAmountRect;
			int popcornAmountCylinder;
			
				Scanner input = new Scanner(System.in);

				popcornVolume = (4/3) * Math.PI * Math.pow(popcornRadius, 3);
				
			System.out.println("What is the length of the rectangular prism (In cm) ?");
				rectLength = Integer.parseInt(input.nextLine());	
				
			System.out.println("What is the width of the rectangular prism (In cm) ?");
				rectWidth = Integer.parseInt(input.nextLine());
			
			System.out.println("What is the height of the rectangular prism (In cm) ?");
				rectHeight = Integer.parseInt(input.nextLine());
				
				rectVolume = rectHeight * rectLength * rectWidth;
				
			System.out.println("With these dimensions the volume of the rectangular prism is " + rectVolume + "cm^3");
			
			
			System.out.println("Assuming that a popcorn kernel is a perfect sphere with a radius of 1.5cm, the volume of one popcorn kernel is " + Math.ceil(popcornVolume) + "cm^3");
			  popcornAmountRect = rectVolume / (int)popcornVolume;
			
			System.out.println(" \nTherefore " + popcornAmountRect + " popcorn kernels can fit") ;
			
			System.out.println("What is the height of the cylinder (In cm) ? ");
				cylinderHeight = Integer.parseInt(input.nextLine());

			System.out.println("What is the radius of the cylinder (In cm) ? ");
				cylinderRadius = Integer.parseInt(input.nextLine());
				
				cylinderVolume = Math.PI * Math.pow(cylinderRadius,2) * cylinderHeight;
			
			System.out.println("The Volume of the cylindrical container is " + Math.floor(cylinderVolume) + "cm^3"); 
					
				popcornAmountCylinder = (int) cylinderVolume / (int)popcornVolume;
			
			System.out.println(" \nTherefore " + popcornAmountCylinder + " popcorn kernels can fit") ;
			
			
	}

}
