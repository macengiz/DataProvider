package org.testng.arrays;

import org.testng.annotations.Test;

public class MultiDimentionalArray {

	@Test

	public void AnimalArray() {

		String[][] animals = new String[4][2];

		animals[0][0] = "Cat";
		animals[0][1] = "Myaw";
		animals[1][0] = "Dog";
		animals[1][1] = "Woof";
		animals[2][0] = "Cow";
		animals[2][1] = "Moo";
		animals[3][0] = "Sheep";
		animals[3][1] = "Baa";

		System.out.println("Neighbor's " + animals[1][0] + " is saying " + animals[1][1]);
		for (int i = 0; i < animals.length; i++) {
			System.out.println(animals[i][0] + " is " + animals[i][1] + " ing");
		}
	}

	@Test

	public void objectsArray() {

		Object[][] myObjects = new Object[2][2];
		String name = "Mike";
		myObjects[0][0] = name;

		Object[][] employees = new Object[2][2];
		employees[0][0] = "Mike";
		employees[0][1] = "Mike@gmail.com";
		employees[1][0] = "steven";
		employees[1][1] = "steven@gmail.com";

		System.out.println(employees[employees.length - 1][employees[employees.length - 1].length - 1]);

		int rows = employees.length;
		int cells = employees[rows - 1].length;
		System.out.println(employees[rows - 1][cells - 1]);

		for (Object[] obj : employees) {
			System.out.println(obj[1]);
		}

		printEmpInfo(employees);
	}

	public void printEmpInfo(Object[][] multiDArray) {
		for (int i = 0; i < multiDArray.length; i++) {
			String name = (String) multiDArray[i][0];
			String email = (String) multiDArray[i][1];

			// System.out.println(multiDArray[i][0] + " is " + multiDArray[i][1]
			// + " ing");
			print2Strings(name, email);
		}
	}

	public void print2Strings(String str1, String str2) {
		System.out.println(str1 + " , " + str2);

	}

}
