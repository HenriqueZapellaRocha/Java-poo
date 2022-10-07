package application;
import java.util.Scanner;
import entities.Contribuinte;
import entities.Fisica;
import entities.Juridica;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;


public class Program {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Quantas pessoas serão digitadas: ");
    int n = sc.nextInt();

    List<Contribuinte> contribuinte = new ArrayList<>();

    for(int i = 1; i <= n; i++) {
    System.out.println("Enter number #" + i);
    char tipoCon = sc.next().charAt(0);
    System.out.println("fisico/juridico: ");
    System.out.println("Nome: ");
    String name = sc.nextLine();
    System.out.print("Renda anual: ");
    Double rendaAnual = sc.nextDouble();

   
        if (tipoCon == 'f') {
        Double gastoComSaude = sc.nextDouble();

        contribuinte.add(new Fisica(name, rendaAnual, gastoComSaude));
        } else {
           Integer numeroDeFuncionarios = sc.nextInt();
           contribuinte.add(new Juridica(name, rendaAnual, numeroDeFuncionarios);
            
           
        }

        for (Contribuinte contribuint : contribuinte) {
            
        }

    }



        sc.close();
    }
}
