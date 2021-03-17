/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;
import java.util.ArrayList;

public class UapCse {
    String name;
    ArrayList<Employee> employees;

    public UapCse(String name) {
        this.name = name;
        employees = new ArrayList<Employee>(); //instantiate//
    }
    private void addNewEmployee(Employee e){
        employees.add(e);
    }
    void addNewEmployee(String n,String l,String d,double s){
        Employee e = new SalariedEmployee(n,l,d,s);
        addNewEmployee(e);
    }
    void addNewEmployee(String n,String l,String d,double s,int hw){
        Employee e = new HourlyEmployee(n,l,d,s,hw);
        addNewEmployee(e);
    }
    void addNewEmployee(String n,String l,String d,double p,double s){
        Employee e = new CommissionEmployee(n,l,d,p,s);
        addNewEmployee(e);
    }
    Employee findEmployee(String id){
        for (int i = 0; i < employees.size(); i++) {
            Employee em = employees.get(i);
            if (id.equals(em.getId())) {
                return employees.get(i);
            }
        }
        return null;
    }
    void increaseSalary(String id,double amt){
        Employee e;
        e = findEmployee(id);
        if (e != null) {
            e.increaseSalary(amt);
        }
    }
    double getSalary(String id){
        Employee e;
        e = findEmployee(id);
         return e.getSalary();
    }
   String display(String id) {
        Employee e;
        e = findEmployee(id);
        if (e != null) {
            e.display();
        }
        return e.display();
    }
        void display(){
            for (int i = 0; i < employees.size(); i++) {
                Employee e = employees.get(i);
                e.display();
            }
        }
    }



