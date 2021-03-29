package java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.sun.org.apache.xml.internal.utils.Hashtree2Node;

public class BubbleSort {

	public static void main(String[] args) {

		List<EmployeeBean> empList = new ArrayList<EmployeeBean>();
		
		empList.add(new EmployeeBean("Mathen",200000));
		empList.add(new EmployeeBean("Janani",100000));
		empList.add(new EmployeeBean("Appa",100000));
		empList.add(new EmployeeBean("Amma",50000));
		empList.add(new EmployeeBean("Kid",500000));
		
		Arrays.sort(empList.toArray());
		for(int i=0 ; i < 10 ; i++)
		{
			empList.add(new EmployeeBean("Mathen" + i, Integer.parseInt((int)Math.abs(Math.random() * 1000 * i) + "")));
		}
		
		empList.sort(new EmployeeBean("",0));
		System.out.println(empList);
		
		empList.forEach(emp -> System.out.println(emp.getName() + " " + emp.getSalary()));
		Collections.sort(empList, (EmployeeBean e1, EmployeeBean e2) -> e1.getSalary().compareTo(e2.getSalary()));
		empList.forEach(emp -> System.out.println(emp.getName() + " " + emp.getSalary()));
	}

}
