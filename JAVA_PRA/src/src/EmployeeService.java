package src;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;
public class EmployeeService {

	public static void main(String[] args) 
	{
		System.out.println("Hello World");
		
//		ArrayList<Integer> listOfNumbers = new ArrayList<>();
//		
//		listOfNumbers.add(55);
//		listOfNumbers.add(22);
//		listOfNumbers.add(33);
//		listOfNumbers.add(44);
		
//		List<Integer> filteredList= listOfNumbers.stream().sorted().toList();
		
//		filteredList.stream().forEach(x->System.out.println(x));
		
		List<Employee> employeeList = Arrays.asList(
				
				new Employee("AA",1000D),
				new Employee("BB",2000D),
				new Employee("CC",3000D),
				new Employee("DD",500D)
					
				);
		
		Optional<Double> employeeSalary = employeeList.stream().map(Employee::getSalary).distinct().sorted(Comparator.reverseOrder()).skip(2).findFirst();
		
		
		System.out.println(employeeSalary);

	}

}
