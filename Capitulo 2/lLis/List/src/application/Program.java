package application;
import entities.Trabalhadores;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n =0;
       
        List<Trabalhadores> list = new ArrayList<>();

        System.out.print("Quantos Trabalhadores serão digitados: ");
        n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            System.out.printf("Trabalhador #%d", i +1);
            System.out.print("\nId: ");
            int id = sc.nextInt();
         
            while (hasId(list, id)) {
                System.out.print("Este id ja existe, tente novamente: ");
				id = sc.nextInt();
            }
            
            System.out.printf("nome: ");
            sc.nextLine();
            String nome = sc.nextLine();
            System.out.println("Salario: ");
            double salario = sc.nextDouble();
            list.add(new Trabalhadores(id, nome, salario));

        }

        System.out.println("Para qual id deseja adicionar salario: ");
        double idd = sc.nextDouble();
      


        sc.close();
    }

    public static boolean hasId(List<Trabalhadores> list, int id) {
		Trabalhadores emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
    }

   

   

   
  
    
}
