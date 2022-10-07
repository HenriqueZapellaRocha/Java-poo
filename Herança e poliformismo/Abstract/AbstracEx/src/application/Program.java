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
    System.out.print("fisico/juridico: ");
    char tipoCon = sc.next().charAt(0);
    System.out.print("Nome: ");
    sc.nextLine();
    String name = sc.nextLine();
    System.out.print("Renda anual: ");
    Double rendaAnual = sc.nextDouble();

   
        if (tipoCon == 'f') {
        
        System.out.print("Gasto com saude: ");
        Double gastoComSaude = sc.nextDouble();
        contribuinte.add(new Fisica(name, rendaAnual, gastoComSaude));

        } else {
            System.out.print("Nuemro de funcionarios: ");
           Integer numeroDeFuncionarios = sc.nextInt();
           contribuinte.add(new Juridica(name, rendaAnual, numeroDeFuncionarios));
            
           
        }

        System.out.println("Tzes paid: ");
        for (Contribuinte contribuint : contribuinte) {
            System.out.println(contribuint.toString());
        }

    }



        sc.close();
    }
}
