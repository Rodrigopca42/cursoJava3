package matriz;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class AcimaDiagonal {
    
 /*
  * Programa que lê um inteiro N e uma matriz quadrada de ordem N contendo       * números inteiros, mostrar a soma dos elementos acima da diagonal principal.
  */

    public static void main(String[] args) {
        
        int n, i, j;

        int[][] num = new int[10][10];

        String n1 = JOptionPane.showInputDialog("Qual a ordem da matriz? ");
        n = Integer.parseInt(n1);

        Scanner tec = new Scanner(System.in);

        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                System.out.print("Elemento [" +i+ ", " +j+ "]: ");
                num[i][j]= tec.nextInt();
            }
        }
        tec.close();

        int soma = 0;
        for(i = 0; i < n; i++){
            for(j = i+1; j < n; j++){
                soma += num[i][j];
            }
        }
        System.out.println("A SOMA DOS ELEMENTOS ACIMA DA DIAGONAL PRINCIPAL = "+soma);

    }
}
