import java.util.Scanner;
public class Pharmacy{
    public static void main(String[] args){
        System.out.println("------Welcome to my Pharmacy!------");
        System.out.println("-------------Medicines-------------");
        System.out.println("1. Paracetamol");
        System.out.println("2. Flexon");
        System.out.println("3. Tren");
        System.out.println("-----------------------------------");
        System.out.println("What medicine would you like?");
        Scanner input = new Scanner(System.in);
        String name = input.next();
        System.out.println("Selected medicine is: " + name);
        System.out.println("Details about medicine");
        if (name == "Paracetamol"){
            System.out.println("Amount: 50   Price per Unit: 5NPR");
        } else if( name == "Flexon"){
            System.out.println("Amount: 20   Price per Unit: 10NPR");
        } else{
            System.out.println("Amount: 10   Price per Unit: 1000NPR");
        }
        System.out.println("How much would you like to order?");
        int amount = input.nextInt();
        int sum = 0;     
        if (name == "Paracetamol"){
            sum = amount * 5;
            System.out.println("Total would be: " + sum);
            if (amount > 50){
                System.out.println("Sadly, that amount is unavailable");
            }
        } else if( name == "Flexon"){
            sum = amount * 10;
            System.out.println("Total would be: " + sum);
            if (amount > 20){
                System.out.println("Sadly, that amount is unavailable");
            }
        } else{
            sum = amount * 1000;
            System.out.println("Total would be: " + sum);
            if (amount > 10){
                System.out.println("Sadly, that amount is unavailable");
            }
        }
        }
}