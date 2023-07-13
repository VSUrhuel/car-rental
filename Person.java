public class Person
{
	private String name;
	private String contactNumber;
	private double money;
	private double initialMoney;

	public Person(String name, double money, String contactNumber)
	{
		this.name = name;
		this.money = money;
		this.initialMoney = money;
		this.contactNumber = contactNumber;
	} 
	public double getMoney()
	{
		return this.money;
	}
	public void subtractAmount(double b)
	{
		this.money -= b;
	}
	@Override
	public String toString()
	{
		return "Name: " + this.name + " - Contact Number: " + this.contactNumber + " - Money: " + this.initialMoney + "\n";
	}
}