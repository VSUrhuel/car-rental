import java.util.*;
public class RentRecord
{
	private ArrayList<Car> cars;
	private ArrayList<Rent> rents;
	private double totalRevenue;

	public RentRecord()
	{
		this.cars = new ArrayList<>();
		this.rents = new ArrayList<>();
		this.totalRevenue = 0;
	}
	public void addCar(Car a)
	{
		cars.add(a);
	}
	public void removeCar(Car a)
	{
		cars.remove(a);
	}
	public boolean addRent(Rent a)
	{
		for(Car car : cars)
		{
			if(car.equals(a.getCar()) && a.getPerson().getMoney() > (a.getCar().getPrice() * a.getNumOfHours()) && car.getIsAvailable())
			{
				rents.add(a);
				a.getPerson().subtractAmount(a.getCar().getPrice() * a.getNumOfHours());
				car.setIsAvailable(false);
				return true;
			}
		}
		return false;
	}
	public boolean removeRent(Rent a)
	{
		for(Car car : cars)
		{
			if(car.equals(a.getCar()))
			{
				rents.remove(a);
				car.setIsAvailable(true);
				return true;
			}
		}
		return false;
	}
	public double businessRevenue()
	{
		for(Rent rent : rents)
		{
			this.totalRevenue += (rent.getNumOfHours() * rent.getCar().getPrice());
		}
		return this.totalRevenue;
	}
	public ArrayList<Car> getListOfCars()
	{
		return this.cars;
	}
	public ArrayList<Rent> getListOfRents()
	{
		return this.rents;
	}
	public void setListOfCars(ArrayList<Car> cars)
	{
		this.cars = cars;
	}
	public void setListOfRents(ArrayList<Rent> rents)
	{
		this.rents = rents;
	}
	@Override
	public String toString(){
		String s = "####----####----#### LIST OF RENTALS ####----####----####\n\n";
		for(Rent r : rents){
			s += r.toString();
			s += ("Total Cost: " + (r.getNumOfHours() * r.getCar().getPrice()) +"\t");
			s += ("Current Balance: " + r.getPerson().getMoney());
			s += "\n\n";
		  }
		s += "Total Revenue: " + this.businessRevenue() + "\n";
		return s;
	}
}