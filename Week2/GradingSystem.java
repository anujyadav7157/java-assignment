import java.util.Scanner;

public class GradingSystem {
    public void PrintGrades(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks");
        int marks = sc.nextInt();
        if (marks>=80 ) {
            System.out.println("distinction"); 
        } 
        else if(marks >=70 && marks<=79){
            System.out.println("merit");
        }
        else if(marks>=50 && marks<=69){
            System.out.println("pass");
        }
        else{
            System.out.println("fail");
        }
    sc.close();
    }
}
