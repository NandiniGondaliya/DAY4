
class FourWheeler extends Vehicle {

	private String audioSystem;
	private int numberOfDoors;
	
	
	public FourWheeler(String make, String vehicleNumber, String fuelType, Integer fuelCapacity, Integer cc) {
		super(make, vehicleNumber, fuelType, fuelCapacity, cc);
		
	}
	public String getAudioSystem() {
		return audioSystem;
	}
	public void setAudioSystem(String audioSystem) {
		this.audioSystem = audioSystem;
	}
	public int getNumberOfDoors() {
		return numberOfDoors;
	}
	public void setNumberOfDoors(int numberOfDoors) {
		this.numberOfDoors = numberOfDoors;
	}
	void displayDetailInfo()
	{
		System.out.println("---Detail Information---");
		System.out.println("audioSystem:"+audioSystem);
		System.out.println("numberOfDoors:"+numberOfDoors);
	}
	
}
