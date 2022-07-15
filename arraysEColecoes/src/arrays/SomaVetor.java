package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class SomaVetor {
    
    /*
     *             Problema "soma_vetor"
     * Faça um programa que leia N números reais e armazene-os em um vetor.  * Em seguida:
     * - Imprimir todos os elementos do vetor
     * - Mostrar na tela a soma e a média dos elementos do vetor
     */

     public static void main(String[] args) {
        int n, i;
        double soma, media;

        Scanner tec = new Scanner(System.in);
    
        System.out.println("");
        System.out.print("Quantos numeros voce vai digitar? ");
        n = tec.nextInt();

        double[] numero = new double[n];

        System.out.println("");
        for(i = 0; i < numero.length; i++){
            System.out.print("Digite o "+ (i + 1) +"º Número: " );
            numero[i] = tec.nextDouble();
        }

        System.out.println("");
        System.out.println( "VALORES = "+ Arrays.toString(numero));
        

        soma = 0;
        for(i = 0; i < numero.length; i++){
            soma += numero[i];
        }

        System.out.printf("SOMA = %.2f%n", soma);
        media = soma / numero.length;   
        System.out.printf("MÉDIA = %.2f%n", media);
        System.out.println("");


     }
}
