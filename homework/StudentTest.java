class Student{
    int id;
    String name;
    String address;
    long phoneNumber;
    String collegeName;
    
    Student(int i, String n, String a, long p, String c){
        id = i;
        name = n;
        address = a;
        phoneNumber = p;
        collegeName = c;
    }
    void displayInfo(){
        System.out.println("Student id: " +id);
        System.out.println("Student name: " + name);
        System.out.println("Student address: " + address);
        System.out.println("Student phone number: " + phoneNumber);
        System.out.println("Student's college name: " + collegeName);
    }
}
public class StudentTest{
    public static void main(String[] args){
        Student a = new Student(1,"Saharsha","Sukedhara",984080962,"Islington");
        a.displayInfo();
    }
}