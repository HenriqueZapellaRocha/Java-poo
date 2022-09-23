package application;
import java.util.Scanner;
import entities.Grade;

public class Program {

public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

Grade gr = new Grade();


System.out.print("Alex grade: ");
gr.FirstGrade = sc.nextDouble();
gr.SecondGrade = sc.nextDouble();
gr.ThridGrade = sc.nextDouble();

System.out.println();
System.out.print("Final grade: " + gr.FinalGrade() + "\n");

if (gr.FinalGrade() >= 60) {
    System.out.print("Pass");
} else {
   
   
   System.out.println("Failed");
   System.out.println(gr);
}









    sc.close();
}




}