package application;
import java.util.Scanner;
import entites.Students;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Qauntos alunos vai digitar: ");
        int n = sc.nextInt();

        Students[] vect = new Students[n];

        for (int i =0; i < vect.length; i++) {

            System.out.print("Escreva o nome do aluno: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Escreva a prieira nota: ");
            double n1 = sc.nextDouble();
            System.out.print("Escreva a segudna nota: ");
            double n2 = sc.nextDouble();
            vect[i] = new Students(name, n1, n2);
        }


        for (int i=0; i < vect.length; i++) {
            double media = (vect[i].getN1() + vect[i].getN2()) / 2;

            if (media >= 6) {
                System.out.println(vect[i].getName());
            }
            

        }


        sc.close();
    }

}