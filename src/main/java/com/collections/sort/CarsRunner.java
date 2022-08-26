package com.collections.sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CarsRunner {
	
	// Comparator is a functional interface . So creatig an anonymous class
	static Comparator<Car> modelsort = new Comparator<Car>() {

		@Override
		public int compare(Car car1, Car car2) {
			if ((car1.model).compareTo(car2.model) > 0) {
				return 1;
			} else if ((car1.model).compareTo(car2.model) < 0) {
				return -1;
			}
			return 0;
		}
	};
	
	// Comparator is a functional interface . So creatig an anonymous class
	static Comparator<Car> companysort = new Comparator<Car>() {

		@Override
		public int compare(Car car1, Car car2) {
			if ((car1.company).compareTo(car2.company) > 0) {
				return 1;
			} else if ((car1.company).compareTo(car2.company) < 0) {
				return -1;
			}
			return 0;
		}
	};

	public static void main(String[] args) {

		Car car1 = new Car("Hyndai", "santro", 500000);
		Car car2 = new Car("Maruthi", "Alto", 400000);
		Car car3 = new Car("Hyndai", "creta", 900000);
		Car car4 = new Car("Tata", "Indica", 300000);
		Car car5 = new Car("Nissan", "Micra", 700000);
		Car car6 = new Car("Renalt", "Duster", 900000);

		List<Car> cars = new ArrayList<Car>();
		cars.add(car1);
		cars.add(car2);
		cars.add(car3);
		cars.add(car4);
		cars.add(car5);
		cars.add(car6);
		
		Map<String,String> map = new HashMap<String,String>();
		Set<Map.Entry<String, String>> aaa = map.entrySet();

		try {
			Collections.sort(cars, modelsort);
			for (Car kar : cars) {
				System.out.println(kar);
			}
			Collections.sort(cars, companysort);
			for (Car kar : cars) {
				System.out.println(kar);
			}
			
			
			//sort from comparable interface
			Collections.sort(cars);
			for (Car kar : cars) {
				System.out.println(kar);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}
		
	}
}
