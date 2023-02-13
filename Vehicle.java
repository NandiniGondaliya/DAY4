
public class Vehicle {

	protected String make;
	protected String vehicleNumber;
	protected String fuelType;
	protected int fuelCapacity;
	protected Integer cc;
	
	public Vehicle(String make,String vehicleNumber,String fuelType,Integer fuelCapacity,Integer cc)
	{
		this.make = make;
		this.vehicleNumber=vehicleNumber;
		this.fuelType=fuelType;
		this.fuelCapacity=fuelCapacity;
		this.cc=cc;
		
	}
//	void displayMake()
//	{
//		System.out.println("Vehicle Make:");
//		System.out.println(make);
//	}
	void displayBasicInfo()
	{
		System.out.println("***"+this.make+"***");
		System.out.println("---Basic Information---");
		System.out.println("Vehicle number:"+this.vehicleNumber);
		System.out.println("Fuel Capacity:"+this.fuelCapacity);
		System.out.println("Fuel Typer:"+this.fuelType);
		System.out.println("cc:"+this.cc);
	}
	
	
}
