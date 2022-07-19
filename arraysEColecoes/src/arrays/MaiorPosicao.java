package arrays;

import java.util.Scanner;

public class MaiorPosicao {
    
    public static void main(String[] args) {
        
        int n, i, posmaior;
        float maior;

        Scanner tec = new Scanner(System.in);

        System.out.print("Quantos Números Vai Digitar? ");
        n = tec.nextInt();

        float[] num = new float[20];

        for(i = 0; i < n; i++){
            System.out.print("Digite o " +(i + 1)+ "º Número: ");
            num[i] = tec.nextFloat(); 
        }
        
        maior = num[0];
        posmaior = 0;
        for(i = 1; i < n; i++){
            if(num[i] > maior){
                maior = num[i];
                posmaior = i;
            }
        }
        System.out.println(" ");
        System.out.printf("MAIOR VALOR = %.1f%n", maior );
        System.out.println("POSIÇÃO DO MAIOR VALOR = "+ posmaior);

    }

}
