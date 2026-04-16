class ElectricityBill{
    String consumerName;
    double unitsConsumed;
    double bill;
    
    ElectricityBill(String c, double u){
        consumerName=c;
        unitsConsumed=u;
    }
    
    double calculateBill(){
        if(unitsConsumed<=100 && unitsConsumed>0){
            bill = unitsConsumed * 5;
        }else{
            bill = 500 + (unitsConsumed-100)*8;
        }
        return bill;
    }
    
    void displayBill(){
        System.out.println("Your total bill is:Rs" + bill);
    }
}

public class ElectricityBillShow{
    public static void main(String[] args){
        ElectricityBill a = new ElectricityBill("Ram",140);
        a.calculateBill();
        a.displayBill();
    }
}