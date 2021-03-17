/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package employee;

public class HourlyEmployee extends Employee {
    public double hourlyRate,hourWorked;
    public HourlyEmployee(String name,String id,String designation,double hourlyRate,double hourWorked){
        super(name,id,designation);
        this.hourlyRate = hourlyRate;
        this.hourWorked = hourWorked;
    }
    @Override
    double getSalary() {
        return hourWorked*hourlyRate;
    }
    @Override
    void increaseSalary(double amt) {
        try {
            if (amt < 0) {
                throw new InvalidSalaryException("Increase amount must be greater than zero.");
            }
            else {
                hourlyRate+=amt;
            }
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
    double getSalary(int hWorked){
        return hWorked*hourlyRate;
    }

    @Override
    String display() {
        return super.display()+"Hourly Rate: "+hourlyRate;
    }
}