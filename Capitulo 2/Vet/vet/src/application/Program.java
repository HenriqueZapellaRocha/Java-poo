package application;
import entities.Persons;
import java.util.Scanner;

public class Program {
public static void main(String[] args) {

Scanner sc = new Scanner(System.in);

System.out.print("Qauntas pessoas vai digitar: ");
int n = sc.nextInt();

Persons vet[] = new Persons[n];

for (int i = 0; i < vet.length; i++) {
    System.out.print("Escreva o nome da pessoa: ");
    sc.nextLine();
    String name = sc.nextLine();
    System.out.print("Qual a idade da pessoa: ");
    int age = sc.nextInt();
    vet[i] = new Persons(name, age);
}

String nameMaior = "";

int maior = 0;

for (int i =0; i < vet.length; i++) {
    if (vet[i].getAge() > maior) {
    nameMaior = vet[i].getName();
    maior = vet[i].getAge();
    } 


        
    
}

System.out.println("Pessoa com a maior idade: " + nameMaior);



    sc.close();
}





}