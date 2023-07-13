public class Rent
{
	public Person person;
	private Car car;
	private int payment;
	private int numOfHours;
	private String contactInfo;
	
	public Rent(Person person, Car car, int numOfHours)
	{
		this.person = person;
		this.car = car;
		this.numOfHours = numOfHours;
	}
	public Car getCar()
	{
		return this.car;
	}
	public Person getPerson()
	{
		return this.person;
	}
	public int getNumOfHours(){
		return this.numOfHours;
	}
	public String contactInfo(){
		return this.contactInfo;
	}
	@Override
	public String toString()
	{
		return this.person + "Number of Hours: " + this.numOfHours + " - Car " + this.car;
	}

}