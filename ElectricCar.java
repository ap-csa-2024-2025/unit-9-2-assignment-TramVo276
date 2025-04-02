public class ElectricCar extends Car {
	// Complete the constructor
	// Note we're reinterpreting "fuelLevel" as "batteryLevel"
	public ElectricCar(String model, int batteryLevel)
	{
		super("Testla", 60);
	}

	// Override getFuelLevel
	// Reinterprets fuelLevel() as a percentage
	// Remember super.getFuelLevel will return fuelLevel!
	public double fuelLevel()
	{
		return super.getFuelLevel() / 100.0; //To make it a battery percent
	}


	// Override milesLeft
	// Takes one parameter - the total number of miles an ElectricCar
	// gets on a full charge.
	// Computes miles left by interpreting fuelLevel as the
	// battery percentage left in the car
	public double milesLeft(double milesOnFullCharge)
	{
		// 100 miles on full charge; 0.50 charge -> 50 miles
		return milesOnFullCharge * this.getFuelLevel();
	}


	// Override toString
	// Should print: model electric car
	public String toString()
	{
		return super.getModel () + " eletric car ";
	}
}

