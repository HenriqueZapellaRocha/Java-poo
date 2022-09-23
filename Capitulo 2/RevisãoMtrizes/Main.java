import java.util.Scanner;




public class Main{
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        System.out.print("Nuemro de linhas da matriz: ");
        int n = sc.nextInt();
        System.out.print("Qual o numero de colunas da matriz: ");
        int j = sc.nextInt();

        int [] [] mat = new int [n] [j];

        for (int i = 0; i < mat.length; i++) {
            for (j = 0; j < mat[i].length; j++) {
                System.out.printf("\nDigite o numero [%d] [%d]: \n", i, j);
                mat [i] [j] = sc.nextInt();
            }

           
        }

        
        System.out.println();
        System.out.print("Escolha um numero: ");
        int d = sc.nextInt();
        System.out.println();



        for (int i = 0; i < mat.length; i++) {
            for ( j =0; j < mat[i].length; j++) {
                if (mat [i] [j] == d) {
                    System.out.printf("\nPosition %d, %d : \n", i, j);

                    if (i == 0 ) {
                        if (j == 0) {
                            System.out.println("Right: " + mat[i][j+1]);
                            System.out.println("Down: " + mat[i+1][j]);
                        } else if (j < mat[i].length) {
                            System.out.println("Left: " + mat[i][j-1]);
                            System.out.println("Down: " + mat[i+1][j]);
                            System.out.println("Right: " + mat[i][j+1]);
                        } 

                    } else if (i == mat.length) {
                        if (j == 0) {
                            System.out.println("Right: " + mat[i][j+1]);
                            System.out.println("Up: " + mat[i-1][j]);
                        } else if (j < mat[i].length) {
                            System.out.println("Left: "+ mat[i][j-1]);
                            System.out.println("Up: " + mat[i-1][j]);
                            System.out.println("Right: " + mat[i][j+1]);
                            System.out.println("Down: " + mat[i+1][j]);
                        } 
                        
                        
                    } else {
                        if (j==0) {
                            System.out.println("Right: "+ mat[i][j+1]);
                            System.out.println("Up: " + mat[i-1][j]);
                            System.out.println("Down: " + mat[i+1][j]);
                        } else if (j < mat[i].length) {
                            System.out.println("Left: "+ mat[i][j-1]);
                            System.out.println("Up: " + mat[i-1][j]);
                            System.out.println("Down: " + mat[i+1][j]);
                            System.out.println("Right: " + mat[i][j+1]);
                        } 
                        
                    }

                }



            }

        }







        sc.close();
    }








}