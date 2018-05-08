import java.util.ArrayList;
import java.util.Scanner;

public class CarApp {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		ArrayList<NewCar> carList = new ArrayList<>();
		
		
		
		UsedCar car1 = new UsedCar("Chevrolet", "Nova", 1974, 24100.00, 23400.1);
		UsedCar car2 = new UsedCar("Ford", "Escape", 2015, 14500.00, 57755.3);
		UsedCar car3 = new UsedCar("Chevrolet", "Bel Air", 1955, 21000.00, 32344.1);
		
		NewCar car4 = new NewCar("Chevrolet", "Corvette", 2018, 67599.00);
		NewCar car5 = new NewCar("Ford", "F-150", 2018, 42000.00);
		NewCar car6 = new NewCar("Dodge", "Challenger", 2018, 31000.00);
		
		carList.add(car1);
		carList.add(car2);
		carList.add(car3);
		carList.add(car4);
		carList.add(car5);
		carList.add(car6);
		
		//System.out.println(carList);
		
		int userNum = 0;
		System.out.println("Welcome to the Grand Circus Motors admin console!");
		System.out.println();
		

		
		userNum = Validator.getInt(scan, "Please enter the number of cars: ");
			
		for (int i = 0; i < userNum; i++) {
			String make = Validator.getString(scan, "Please enter car make: ");
			String model = Validator.getString(scan, "Please enter car model: ");
			int year = Validator.getInt(scan, "Please enter car year: ");
			double price = Validator.getDouble(scan, "Please enter car price: ");
			System.out.println();
			carList.add(new NewCar(make, model, year, price));
			
			
		}
		
		System.out.println("Current Inventory of cars:");
		System.out.println();
		//System.out.println(carList);
		
		for (NewCar car : carList ) {
			
			System.out.println(car);
		}
		
		
	}
	

}