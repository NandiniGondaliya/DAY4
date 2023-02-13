import java.util.Scanner;
public class VehicleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String make;
		String vehicleno;
		String fueltype;
		int fuelCapacity;
	    int cc;
	    
	    

		System.out.println("1.Four Wheeler");
		System.out.println("2.Two Wheeler");
		System.out.println("Enter Vehicle Type:");
		Scanner sc=new Scanner(System.in);
		int choice=sc.nextInt();
		if(choice==1)
		{
			System.out.println("Vehicle Make:");
			make=sc.next();
			System.out.println("Vehicle Number:");
			vehicleno=sc.next();
			System.out.println("Fuel Type:");
			System.out.println("1.Petrol");
			System.out.println("2.Diesel");
		    int type=sc.nextInt();
		    
		    if(type==1)
		    {
		    	fueltype="Petrol";
		    }
		    else
		    {
		    	fueltype="Diesel";
		    }
		    System.out.println("Fuel Capacity:");
		    fuelCapacity=sc.nextInt();
		    System.out.println("Engine Capacity:");
		    cc=sc.nextInt();
		    System.out.println(cc);
		    
		    FourWheeler fw=new FourWheeler(make,vehicleno,fueltype,fuelCapacity,cc);
		    
		    Vehicle v=new Vehicle(make,vehicleno,fueltype,fuelCapacity,cc);
		    
		    System.out.println("Audio System:");
		    String audio=sc.next();
		    System.out.println("No of Doors:");
		    int doors=sc.nextInt();
		    fw.setAudioSystem(audio);
		    fw.setNumberOfDoors(doors);
		    v.displayBasicInfo();
		    fw.displayDetailInfo();
		    
			
		}
		if(choice==2)
		{
			System.out.println("Vehicle Make:");
			make=sc.next();
			System.out.println("Vehicle Number:");
			vehicleno=sc.next();
			System.out.println("Fuel Type:");
			System.out.println("1.Petrol");
			System.out.println("2.Diesel");
		    int type=sc.nextInt();
		    
		    if(type==1)
		    {
		    	fueltype="Petrol";
		    }
		    else
		    {
		    	fueltype="Diesel";
		    }
		    System.out.println("Fuel Capacity:");
		    fuelCapacity=sc.nextInt();
		    System.out.println("Engine Capacity:");
		    cc=sc.nextInt();
		    System.out.println(cc);
		    
		    System.out.println("Kick Start Available(YES/NO):");
		    String kick=sc.next();
		    
		    TwoWheeler tw=new TwoWheeler(make,vehicleno,fueltype,fuelCapacity,cc);
		    tw.setKickStartAvailable(kick);
		    
		    Vehicle vv=new Vehicle(make,vehicleno,fueltype,fuelCapacity,cc);
		    vv.displayBasicInfo();
		    tw.displayDetailInfo();
			
		}
		sc.close();
	}

}
