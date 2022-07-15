package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Negativos{

    /*
     *                       Problema "negativos"
     * Faça um programa que leia um número inteiro positivo N (máximo = 10)  * e  depois N números inteiros e armazene-os em um vetor. Em seguida,   * mostrar na tela todos os números negativos lidos.
     */

    public static void main(String[] args) {
        

        Scanner tec = new Scanner(System.in);

        int n, i;

        System.out.print("Quantos numeros voce vai digitar? ");
        n = tec.nextInt();

        int[] numero = new int[n];

        for(i = 0; i < numero.length; i++){
            System.out.print("Digite um numero: ");
            numero[i] = tec.nextInt();
    
        }

        System.out.println("");
        System.out.println("NÚMEROS NEGATIVOS");
        System.out.println("");

        for(i = 0; i < numero.length; i++){
            if(numero[i] < 0){
                System.out.println(numero[i]);
            }
        }


    }
}