
package employee;

public class SalariedEmployee extends Employee{
    public double monthlySalary;
    public SalariedEmployee(String name,String id,String designation,double monthlySalary){
        super(name,id,designation);
        this.monthlySalary = monthlySalary;
    }

    @Override
    double getSalary() {
        return monthlySalary;
    }

    @Override
    void increaseSalary(double amt)  {
        try {
            if (amt < 0) {
                throw new InvalidSalaryException("Increase amount must be greater than zero.");
            } else {
                monthlySalary += amt;
            }
        }
        catch(Exception e){
            System.out.println(e);

        }
    }
    String display(){
        return super.display()+"Salary: "+monthlySalary;
    }
}