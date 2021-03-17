
package employee;

public class CommissionEmployee extends Employee {
    public double commission,sale;
    public CommissionEmployee(String name, String id, String designation, double commission, double sale){
        super(name, id, designation);
        this.commission = commission;
        this.sale = sale;
    }
    @Override
    double getSalary() {
        return commission*sale;
    }

    @Override
    void increaseSalary(double amt) {
        try {
            if (amt < 0) {
                throw new InvalidSalaryException("Increase amount must be greater than zero.");
            }
            else {
                commission += amt;
            }
        }
        catch(Exception e){
            System.out.println(e);

        }

    }
    double getSalary(double _sale){
        return commission*_sale;
    }

    @Override
    String display() {
        return super.display()+"Commission: "+commission;
    }
}