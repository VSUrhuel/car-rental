public class Main
{
	public static void main(String[] args) {
		Car[] cars = new Car[5];
		cars[0] = new Car("Mistsubishi", 500, "ABC 234");
		cars[1] = new Car("Honda", 1000, "DEf 531");
		cars[2] = new Car("Hanabishi", 1500, "IKL 312");
		cars[3] = new Car("Ford", 2000, "HES 290");
		cars[4] = new Car("Ranger", 2500, "UYI 462");

		RentRecord rec = new RentRecord();
		rec.addCar(cars[0]);
		rec.addCar(cars[1]);
		rec.addCar(cars[2]);
		rec.addCar(cars[3]);
		rec.addCar(cars[4]);

		Person rhuel = new Person("Rhuel", 5000, "2617-3982-834");
		Person hannah = new Person("Hannah", 1500, "2617-3982-835");
		Person aleth = new Person("Aleth", 30000, "2617-3982-836");
		Person peter = new Person("Peter", 32000, "2617-3982-837");
		Person swisha = new Person("Swisha", 43000, "2617-3982-838");

		rec.addRent(new Rent(rhuel, cars[0], 5));
		rec.addRent(new Rent(hannah, cars[1], 10));
		rec.addRent(new Rent(aleth, cars[2], 15));
		rec.addRent(new Rent(peter, cars[3], 12));
		rec.addRent(new Rent(swisha, cars[4], 14));

		System.out.println(rec);
	}
}