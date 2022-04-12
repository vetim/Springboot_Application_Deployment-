package com.ecomerce.webapp;

import org.springframework.stereotype.Repository;
 
import com.ecomerce.webapp.Employee;
import com.ecomerce.webapp.Employees;
 
@Repository
public class EmployeeDAO 
{
    private static Employees list = new Employees();
     
    static
    {
        list.getEmployeeList().add(new Employee(1, "John", "Smith", "john123@gmail.com"));
        list.getEmployeeList().add(new Employee(2, "Adam", "Schmidt", "aschmidt@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "David", "Alan", "david@gmail.com"));
        list.getEmployeeList().add(new Employee(3, "Lukas", "Coolin", "lukas@gmail.com"));
    }
     
    public Employees getAllEmployees() 
    {
        return list;
    }
     
    public void addEmployee(Employee employee) {
        list.getEmployeeList().add(employee);
    }
}
