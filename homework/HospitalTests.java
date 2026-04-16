class Patient{
    String patientName;
    int age;
    int daysAdmitted;
    double dailyCharge;
    
    Patient(String p, int a, int d, double da){
        patientName = p;
        age = a;
        daysAdmitted = d;
        dailyCharge = da;
    }
    
    double calculateTotalBill(){
        double ogbill;
        double bill;
        bill = 0;
        ogbill = daysAdmitted * dailyCharge;
        if(daysAdmitted>7){
            bill = ogbill - ogbill * 0.1;
        } else{
            bill = ogbill;
        }
        System.out.println("You stayed for: " + daysAdmitted);
        System.out.println("Your daily charge was: " + dailyCharge);
        System.out.println("Your bill is : " + bill);
        return bill;
    }
    
    void description(){
        System.out.println("Name: " + patientName);
        System.out.println("Age : " + age);
        System.out.println("Days Admitted: " + daysAdmitted);
        System.out.println("Daily charge: " + dailyCharge);
    }
}
public class HospitalTests{
    public static void main(String[] args){
        Patient a = new Patient("Saharsha",18,3,500.0);
        Patient b = new Patient("Sujan",18,8,500.0);
        a.description();
        a.calculateTotalBill();
        System.out.println("--------------------------------");
        b.description();
        b.calculateTotalBill();
    }
}