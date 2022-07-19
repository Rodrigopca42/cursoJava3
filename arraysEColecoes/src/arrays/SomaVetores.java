package arrays;

import java.util.Scanner;

public class SomaVetores{

    public static void main(String[] args) {
        
        int i, n;
        
        int[] A = new int[10];
        int[] B = new int[10];
        int[] C = new int[10];

        Scanner tec = new Scanner(System.in);

        System.out.print("Quantos Valores Você Vai Digitar?");
        n = tec.nextInt();

        System.out.println("Digite os Valores de A:");
        for(i = 0; i < n; i++){
            A[i] = tec.nextInt();
        }

        System.out.println("Digite os Valores de B:");
        for(i = 0; i < n; i++){
            B[i] = tec.nextInt();
        }

        for(i = 0; i < n; i++){
           C[i] = A[i] + B[i];
        }

        System.out.println("Vetor Resultante:");
        for(i = 0; i < n; i++){
            System.out.println(C[i]);
        }

    }

}