import java.util.Scanner;
public class Taxi{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        System.out.print("Enter distance in KM");
        double distance=scanner.nextDouble();
        System.out.print("Enter Time in Minutes");
        double time=scanner.nextDouble();
        System.out.print("Are you local(Yes/No)");
        String local=scanner.nextLine();
        boolean localtraveller=local.equalsIgnoreCase("yes") ?true:false;
        System.out.print("Is it Night(Yes/No)");
        String night=scanner.nextLine();
        boolean localnight=local.equalsIgnoreCase("yes") ?true:false;
        /// flare price
        int baseflare=100;
        int perkmflare=50;
        int perminuteflare=10;
        double flare= baseflare + (perkmflare*distance)+(perminuteflare*time);
        /// if you are local 10percent
        flare=(localtraveller)?flare*0.9:flare;
        // if night traveller increase by 20percent
        flare=(localnight)? flare*1.2:flare;
        // output
        System.out.println("Your total will be"+flare);
        scanner.close();
        
        
    }
}

