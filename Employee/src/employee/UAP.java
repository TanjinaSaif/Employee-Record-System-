
package employee;

public class UAP {
    static UapCse myUap = new UapCse("University");
    
    void salaried(String name, String id, String des, double sal){
        myUap.addNewEmployee(name, id, des, sal);
    }
    void hourly(String name, String id, String des, double rate,int hw){
        myUap.addNewEmployee(name, id, des,rate,hw);
    }
    void commission(String name, String id, String des, double com,double sale){
        myUap.addNewEmployee(name, id, des,com,sale);
    }
    void increaseSalary(String id,double amt){
        myUap.increaseSalary(id, amt);
    }
  
    
}





