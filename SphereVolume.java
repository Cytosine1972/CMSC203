import java.util.Scanner;

public class SphereVolume {

	public static void main(String[] args) {
		//Print the purpose of the program 
		System.out.println("Converts diameter into volume of a sphere.");
		//Print a prompt asking for the diameter of a sphere 
		System.out.println("Enter diameter of a sphere:");
		//Read the diameter 
		Double diam;
		Scanner keyboard = new Scanner(System.in);
		diam = keyboard.nextDouble();
		//Calculate the radius as diameter divided by 2 
		double radius = diam/2;
		//Calculate volume of the sphere using the formula 
		double volume = ((double)4/3)*(Math.PI)*Math.pow(radius, 3);
		//Print the volume
		System.out.println("The volume of the sphere is "+volume+" cubic units");
	}

}
