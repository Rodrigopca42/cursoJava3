package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Altura {
    /*
     *                       Problema "alturas"
     * Fazer um programa para ler nome, idade e altura de N pessoas, conforme
     * exemplo. Depois, mostrar na tela a altura média das pessoas, e mostrar * também a porcentagem de pessoas com menos de 16 anos, bem como os     * nomes dessas pessoas caso houver.
     */

public static void main(String[] args) {
    
    int n, i, quantIdades;
    double soma, porcentagem, media;

    //Essa janela pergunta quantos casos terá o vetor.
    String n1 = JOptionPane.showInputDialog("Quantos Casos Sarão Digitados? ");
    n = Integer.parseInt(n1);

    String[] nome = new String[n];
    int[] idade = new int[n];
    float[] altura = new float[n];

    Scanner tec = new Scanner(System.in);

    //loop para ler os dados dos vetores.
    for(i = 0; i < n; i++){
        System.out.println("Dados da " + (i+1) + "º Pessoa:");
        System.out.print("NOME: ");
        nome[i] = tec.nextLine();
        
        
        System.out.print("IDADE: ");
        idade[i] = tec.nextInt();
        
        System.out.print("ALTURA: ");
        altura[i] = tec.nextFloat();
        
        tec.nextLine();
    }
    tec.close();

    soma = 0;
    for(float alturas: altura){
        soma += alturas;
    }
    
    media = soma / altura.length;

        System.out.println ("");
        System.out.printf("Altura Média: %.2f%n", media);


        quantIdades = 0;
        for(i = 0; i < idade.length; i++){
            if ( idade[i] < 16){
                quantIdades++;
            }
        }
            porcentagem = quantIdades * 100 / idade.length;
        
            System.out.println("Pessoas com menos de 16 anos: "+ porcentagem +"%");

        for(i = 0; i < idade.length; i++) {
            if( idade[i] < 16){
                System.out.println(nome[i]);
            }
        }   
}

}
