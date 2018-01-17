package org.testng.dataprovider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class DataProviderDemo {

	@Test(dataProvider = "EmployeesInfo")

	public void dataProviderTest(String name, String email) {

		System.out.println("name: " + name + " email " + email);
	}

	@DataProvider(name = "EmployeesInfo")

	public Object[][] EmployeesData() {

		Object[][] employees = new Object[3][2];

		employees[0][0] = "Mike";
		employees[0][1] = "Mike@gmail.com";
		employees[1][0] = "steven";
		employees[1][1] = "steven@gmail.com";
		employees[2][0] = "sarah";
		employees[2][1] = "sarah@gmail.com";

		return employees;
	}

}
