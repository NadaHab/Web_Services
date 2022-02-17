package com.example.restservice.service;

import com.example.restservice.model.Address;
import com.example.restservice.model.City;
import com.example.restservice.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class EmployeeService {

    static List<Employee> employees = new ArrayList<>();

    public List<Employee> getAllEmployees() {

        Employee employee1= new Employee(1,"John","Smith",new Address(233,
                "Dorval",new City("Montreal","QC")));

        Employee employee2= new Employee(2,"Tom","Hanks",new Address(104,
                "Avenue100",new City("Laval","QC")));
        Employee employee3= new Employee(3,"Sam","Phill",new Address(4501,
                "Maven",new City("Montreal","QC")));

        employees.add(employee1);
        employees.add(employee2);
        employees.add(employee3);


        return employees;
    }

    public Employee getById(int id){
        for(Employee p : employees){
            if (p.getId() == id){
                return p;
            }
        }
        return null;
    }

    public void addEmployee(Employee pet){
        employees.add(pet);
    }

}
