package com.test.lambda.ComparatorExmple;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
 
public class EmployeeMain {
 
 public static void main(String[] args)
 {
  List<Employee> employeeList=getEmployees();
  System.out.println("Before Sorting: ");
  System.out.println(employeeList);
                // in classic way
//  Collections.sort(employeeList,new Comparator() {
//   @Override
//	  public int compare(Object e1,Object e2)
//   {
//    return ((Employee) e1).getEmployeeName().compareTo(((Employee) e2).getEmployeeName());
//   }
 
   
//  });
  Collections.sort(employeeList, (Employee e1, Employee e2)->e1.getEmployeeName().compareTo(e2.getEmployeeName()));
                System.out.println("After Sorting: ");
                System.out.println(employeeList);
 }
 
 public static List<Employee> getEmployees()
 {
  List<Employee> employeesList=new ArrayList<Employee>();
  Employee e1=new Employee("John", 35);
  Employee e2=new Employee("Adam", 22);
  Employee e3=new Employee("Arpit", 28);
  Employee e4=new Employee("John", 30);
  Employee e5=new Employee("Grace", 38);
  Employee e6=new Employee("Arpit", 25);
  employeesList.add(e1);
  employeesList.add(e2);
  employeesList.add(e3);
  employeesList.add(e4);
  employeesList.add(e5);
  employeesList.add(e6);
  return employeesList;
 
 }
}
