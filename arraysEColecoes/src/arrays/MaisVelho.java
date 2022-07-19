package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MaisVelho {
     public static void main(String[] args) {

        int i, n, maior, posMaior;
        
        
        String[] nome = new String[10];
        int[] idade = new int[10];
        
        String n1 = JOptionPane.showInputDialog("Quantas Pessoas Vai Digitar?");
        n = Integer.parseInt(n1);

        Scanner tec = new Scanner(System.in);

        for(i = 0; i < n; i++){
            System.out.println("DADOS DA " + (i + 1)+ "º PESSOA:");
            System.out.print("NOME: ");
            nome[i] = tec.nextLine();
            System.out.print("IDADE: ");
            idade[i] = tec.nextInt();
            tec.nextLine();
        }
        tec.close();

        maior = idade[0];
        posMaior = 0;
        for(i = 1; i < n; i++){
            if(idade[i] > maior){
                maior = idade[i];
                posMaior = i;
            }
        }
        System.out.println("PESSOA MAIS VELHA: "+ nome[posMaior]);




     }
}
