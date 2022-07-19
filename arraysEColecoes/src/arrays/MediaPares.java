package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MediaPares {
    public static void main(String[] args) {
        
        String n1 = JOptionPane.showInputDialog("Quantos Elementos Vai Ter o Vetor?");
        int n = Integer.parseInt(n1);

        int[] num = new int[20];

        Scanner tec = new Scanner(System.in);

        for(int i = 0; i < n; i++){
            System.out.print("Digite o "+ (i + 1)+ "º Número:");
            num[i] = tec.nextInt();
        }
        tec.close();

        int soma = 0;
        int contPares = 0;
        for(int i = 0; i < n; i++){
            if(num[i] % 2 == 0){
                soma += num[i];
                contPares++;
            }
        }

        if(contPares == 0){
            System.out.println("NENHUM NÚMERO PAR.");
        }else{
            float media = soma / contPares;
            System.out.printf("MÉDIA DOS PARES : %.1f", media);
        }

        
        
        

    }
}
