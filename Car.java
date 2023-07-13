public class Car
{
	private String name;
	private double price;
	private String plateNumber;
	private boolean isAvailable;

	public Car(String name, double price, String plateNumber){
		this.name = name;
		setPrice(price);
		this.plateNumber = plateNumber;
		this.isAvailable = true;
	}
	public void setPrice(double price){
		this.price = (price > 0) ? price : 0;
	}
	public void setPlateNumber(String plateNumber){
		this.plateNumber = plateNumber;
	}
	public String getName(){
		return this.name;
	}
	public double getPrice(){
		return this.price;
	}
	public String getPlateNumber(){
		return this.plateNumber;
	}
	public boolean getIsAvailable()
	{
		return this.isAvailable;
	}
	public void setIsAvailable(boolean s)
	{
		this.isAvailable = s;
	}
	@Override
	public boolean equals(Object obj)
	{
		return (obj instanceof Car) ? ((((Car)obj).getPlateNumber() == this.plateNumber) ? true : false) : false;
	}
	@Override
	public String toString(){
		return "Name: " +this.name+ " | Price/Hour: " +this.price+ " | Plate Number: " +this.plateNumber+ " [" +this.isAvailable+ "]" + "\n";
	}

}