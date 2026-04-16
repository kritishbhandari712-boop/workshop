import java.util.Scanner;

public class Rickshaw{
    public static void main(String[] args){
    Scanner input = new Scanner(System.in);

    System.out.println("What is the distance you are travelling, in KM?");
    int distance = input.nextInt();

    System.out.println("How long might travelling there take in minutes?");
    int time = input.nextInt();

    System.out.println("Is it night right now? y/n");
    String nightInput = input.next();
    boolean isNight = nightInput.equals("y");

    int baseFare = 50;
    int perKm = 20;
    int perMin = 5;

    int price = baseFare + (distance * perKm) + (time * perMin);

    if(isNight){
        price = price + (price * 15 / 100);
    }

    System.out.println("Your final fare is: Rs. " + price);
    }
}