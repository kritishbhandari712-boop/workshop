import java.util.Scanner;
public class Scholarship{
    public static void main(String[] args){
        System.out.println("Enter your GPA: ");
        Scanner input = new Scanner(System.in);
        double gpa = input.nextDouble();
        if(gpa>=0.0 && gpa<=4.0){
            if(gpa>=0.0 && gpa <=1.0){
                System.out.println("You have F grade");
            }else if(gpa>=1.0 && gpa <=2.0){
                System.out.println("You have C grade");
            }else if(gpa>=0.0 && gpa <=3.0){
                System.out.println("You have B grade");
            }else{
                System.out.println("You have A grade");
            }if(gpa>= 3.0 && gpa<=4.0){
                System.out.println("You are eligible for scholarship.");
            }
        }else{
            System.out.println("Invalid GPA.");
        }
    }
}