import java.util.ArrayList;
import java.util.Scanner;

public class Main {
	String type, brand, name, license;
	int topspeed, gas, wheelcar, wheelmotor, entertainment, helm;

	public Main() {
		Scanner scan = new Scanner(System.in);
		ArrayList<String> data = new ArrayList<String>();
		ArrayList<Integer> data1= new ArrayList<Integer>();
		do {
			System.out.println("Input type [Car | Motorcycle]: ");
			type = scan.nextLine();
			data.add(type);
		}while (!type.matches("Car")|| !type.matches("Motorcycle"));
		do {			
			System.out.println("Input brand [>= 5]: ");
			brand = scan.nextLine();
			data.add(brand);
		}while(brand.length() < 5);
		do {
			System.out.println("Input Name [>=5]: ");
			name= scan.nextLine();
			data.add(name);
		}while(name.length() < 5);
		do {
			
			System.out.println("Input License Number");
			license = scan.nextLine();
			data.add(license);
		}while (!license.matches("[A-Z][ ]\\d{1,4}[ ]\\d{1,3}"));
		do {
			System.out.println("Input top speed [100<= topSpeed <= 250]: ");
			topspeed = scan.nextInt();
			data1.add(topspeed);
		}while (topspeed < 100 || topspeed > 250);
		do {
			System.out.println("Input gas capacity [30 <= gasCap <= 60]: ");
			gas = scan.nextInt();
			data1.add(gas);
		}while (gas < 30 || gas > 60);
		if (type.matches("Car")) {
			do {
				System.out.println("Input wheel [4 <= wheel <= 6]: ");
				wheelcar = scan.nextInt();
				data1.add(wheelcar);
			}while (wheelcar<4 || wheelcar >6);
			do {
				System.out.println("Input entertainment system amount [>=1]: ");
				entertainment = scan.nextInt();
				data1.add(entertainment);
			}while (entertainment<1);
		}
		else if (type.matches("Motorcycle")) {
			do{
				System.out.println("Input wheel car [2 <= wheel <= 3]: ");
				wheelmotor = scan.nextInt();
				data1.add(wheelmotor);
			}while (wheelmotor<2||wheelmotor>3);
			do {
				System.out.println("Input helm amount [>=1]: ");
				helm = scan.nextInt();	
				data1.add(helm);
			}while (helm<1);
		}
			System.out.println(data);
			System.out.println(data1);
	}
	
	public static void main(String[] args) {
		new Main();

	}


}
