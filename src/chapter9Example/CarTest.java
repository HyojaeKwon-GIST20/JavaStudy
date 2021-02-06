package chapter9Example;
import java.util.ArrayList;

public class CarTest {
	public static void main(String[] args) {
		ArrayList<Car> carList = new ArrayList<Car>();
		carList.add(new Sonata());
		carList.add(new Granduer());
		carList.add(new Avante());
		carList.add(new Genesis());
		
		for(Car car:carList) {
			System.out.println();
			System.out.println("======================");
			car.run();
			System.out.println("======================");
			System.out.println();
		}
		
	}

}
