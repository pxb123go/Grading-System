import java.util.Scanner;

class Grading{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any Marks out of 100");
        int Marks=sc.nextInt();
        if (Marks>=90) {
            System.out.println("A* grade");  
        }
       else if (Marks>=80) {
            System.out.println("A+ grade");  
        }
       else if (Marks>=70) {
            System.out.println("B grade");  
        }
        else {
            System.out.println("C grade");  
        }
    }
}