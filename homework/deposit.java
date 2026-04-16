import java.util.Scanner;
public class deposit{
    public static void main(String[] args){
        Scanner scanner=new Scanner(System.in);
        String ans="yes";
        while(ans.equalsIgnoreCase("yes")){
           int intrest=10;
           System.out.println("Enter the principle it must at least 1000");
           int p=scanner.nextInt();
           scanner.nextLine();
           if(p<1000){
               System.out.println("Principle below than minimal limit");
               continue;
           }
           int time;
           System.out.println("Enter time should not excess 5");
            time=scanner.nextInt();
           scanner.nextLine();
           if(time>5){
               System.out.println("Time above 5 year");
               continue;
           }
           int n=12;
           double a = p*Math.pow((1 +(double)intrest/(100*n)), n * time);
           double f=0.005*p;
           double finalamount=a-f;
           System.out.println("The compount interest after"+time+ "year at"+intrest+"% is"+finalamount);
           System.out.println("Do you want to do more CI then click Yes");
           ans=scanner.nextLine();
           
        }
        scanner.close();
    }
}