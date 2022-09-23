package appplication;
import java.util.Scanner;
import entities.Count;

public class Program {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        Count count;


        System.out.println("Entre com os dados do usuario: ");
        System.out.print("Escreva o numero da conta: ");
        double numero = sc.nextDouble();
        System.out.print("Escreva o seu nome: ");
        sc.nextLine();
        String name = sc.nextLine();
        System.out.print("Deseja adicionar um valor inicial? s/n" );
        char opcao = sc.next().charAt(0);

        if (opcao == 's') {
            System.out.print("Escreva quanto deseja adicionar: ");
            double saldo = sc.nextDouble();
            count = new Count(name, saldo, numero);
        } else {
            count = new Count(name, numero);
        }

        System.out.print("Qaunto deseja depositar: ");
        double deposito = sc.nextDouble();

        count.AddSaldo(deposito);

        System.out.println(count);

        System.out.print("Quanto deseja sacar: ");
        double saque = sc.nextDouble();
        count.LessSaldo(saque);

        System.out.print(count);


        sc.close();
    }

}
