package arrays;

import java.util.Scanner;

public class numerosPares {
    
    public static void main(String[] args) {
        
        int i, n, quantidade;


        Scanner tec = new Scanner(System.in);

        int[] num = new int[10] ;

        System.out.print("Quantos Números Você Vai Digitar? ");
        n = tec.nextInt();

        tec.close();
        
        for(i = 0; i < n; i++){
            System.out.print("Digite o "+ (i + 1)+"º  Número: ");
            num[i] = tec.nextInt();
        }

        System.out.println(" ");
        System.out.println("NÚMEROS PARES:");
       
        
        quantidade = 0;
        for(i = 0; i < n; i++ ){
            if(num[i] % 2 == 0){
                System.out.print(num[i] +" ");
                quantidade++;
            }
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("QUANTIDADE DE PARES: "+ quantidade);
        System.out.println(" ");

        
    }

}
