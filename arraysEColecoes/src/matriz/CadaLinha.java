package matriz;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class CadaLinha {
    
    public static void main(String[] args) {
        
        int n,i,j;

        int[][] num = new int[10][10];

        String n1 = JOptionPane.showInputDialog("Qual a ordem da matriz?");
        n = Integer.parseInt(n1); 

        Scanner tec = new Scanner(System.in);

        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                System.out.print("Elemento [" + i + ", " +j+ "]: ");
                num[i][j] = tec.nextInt();
            }
        }
        tec.close();

        System.out.println("MAIOR ELEMENTO DE CADA LINHA:");
        for(i = 0; i < n; i++){
            int maior = num[i][0];
            
            for(j = 1; j < n; j++){
                if(num[i][j] > maior){
                    maior = num[i][j];
                   
                } 
            }
            System.out.println(maior);
        }

    }
}
