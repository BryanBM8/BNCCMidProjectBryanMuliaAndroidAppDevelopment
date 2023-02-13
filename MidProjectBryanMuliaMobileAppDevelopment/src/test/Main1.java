package test;
import java.util.Scanner;

public class Main1 {
	public class Vehicle {
	    private String brand;
	    private String name;
	    private String licenseNumber;
	    private int topSpeed;
	    private int gasCapacity;
	    private int numberOfWheels;
	    private int entertainmentSystem;
	    private int numberOfHelmets;
	
	    public Vehicle(String brand, String name, String licenseNumber, int topSpeed, int gasCapacity, int numberOfWheels, int entertainmentSystem, int numberOfHelmets) {
	        if (brand.length() < 5) {
	            throw new IllegalArgumentException("Brand name must have at least 5 characters");
	        }
	        if (name.length() < 5) {
	            throw new IllegalArgumentException("Vehicle name must have at least 5 characters");
	        }
	        if (!licenseNumber.matches("[A-Z][ ]\\d{1,4}[ ]\\d{1,3}")) {
	            throw new IllegalArgumentException("License number format is incorrect. Correct format is A-Z followed by 1-4 digits followed by 1-3 capital letters.");
	        }
	        if (topSpeed < 100 || topSpeed > 250) {
	            throw new IllegalArgumentException("Top speed must be between 100 and 250");
	        }
	        if (gasCapacity < 30 || gasCapacity > 60) {
	            throw new IllegalArgumentException("Gas capacity must be between 30 and 60");
	        }
	        if (numberOfWheels < 2 || numberOfWheels > 3) {
	            throw new IllegalArgumentException("Number of wheels for Motorcycle must be between 2 and 3");
	        }
	        if (numberOfWheels < 4 || numberOfWheels > 6) {
	            throw new IllegalArgumentException("Number of wheels for Car must be between 4 and 6");
	        }
	        if (entertainmentSystem < 1) {
	            throw new IllegalArgumentException("Car must have at least 1 entertainment system");
	        }
	        if (numberOfHelmets < 1) {
	            throw new IllegalArgumentException("Motorcycle must have at least 1 helmet");
	        }
	        this.brand = brand;
	        this.name = name;
	        this.licenseNumber = licenseNumber;
	        this.topSpeed = topSpeed;
	        this.gasCapacity = gasCapacity;
	        this.numberOfWheels = numberOfWheels;
	        this.entertainmentSystem = entertainmentSystem;
	        this.numberOfHelmets = numberOfHelmets;
	    }

	    public static void Main1() {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter brand: ");
	        String brand = sc.nextLine();
	        System.out.print("Enter name: ");
	        String name = sc.nextLine();
	        System.out.print("Enter license number: ");
	        String licenseNumber = sc.nextLine();
	        System.out.print("Enter top speed: ");
	        int topSpeed = sc.nextInt();
	        System.out.print("Enter gas capacity: ");
	        int gasCapacity = sc.nextInt();
	        System.out.print("Enter number of wheels: ");
	        int numberOfWheels = sc.nextInt(); 
	        int entertainmentSystem = 0;
	        int numberOfHelmets = 0;
	        if (numberOfWheels >= 4) {
	        System.out.print("Enter number of entertainment systems: ");  
	        entertainmentSystem = sc.nextInt();
	        		} 
	        else { 
	        		System.out.print("Enter number of helmets: ");
	        		numberOfHelmets = sc.nextInt();
	        		} 
	        try { 
	        	Vehicle vehicle = new Vehicle(brand, name, licenseNumber, topSpeed, gasCapacity, numberOfWheels, entertainmentSystem, numberOfHelmets); 
	        		System.out.println("Vehicle created successfully"); 
	        		} catch (IllegalArgumentException e) {
	        		System.out.println(e.getMessage());
	        		}
	        		} 
	        		}

					public static void main(String[] args) {
						// TODO Auto-generated method stub
				new Main1();
					}
					}
				}


