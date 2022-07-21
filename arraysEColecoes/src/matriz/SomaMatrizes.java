package matriz;

import java.util.Scanner;

public class SomaMatrizes {

    /*
     *  Programa que lê duas matrizes de números inteiros A e B, contendo M      * linhas e N colunas cada, depois armazenar a soma de A e B em uma terceira  * matriz C, onde cada elemento desta é a soma dos elementos correspondentes  * das matrizes originais
     */
    
    public static void main(String[] args) {
        

        int m, n, i, j;

        int[][] matA = new int [10][10];
        int[][] matB = new int [10][10];
        int[][] matC = new int [10][10];

        Scanner tec = new Scanner(System.in);

        System.out.print("Quantas linhas vai ter cada matriz? ");
        m = tec.nextInt();

        System.out.print("Quantas colunas vai ter cada matriz? ");
        n = tec.nextInt();

        System.out.println("Digite os elementos da matriz A:");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                System.out.print("Elemento ["+i+ ", "+j+"]:");
                matA[i][j] = tec.nextInt();
            }
        }

        System.out.println("Digite os elementos da matriz B:");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                System.out.print("Elemento ["+i+ ", "+j+"]:");
                matB[i][j] = tec.nextInt();
            }
        }
        tec.close();

        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                matC[i][j] = matA[i][j] + matB[i][j];
                System.out.print(matC[i][j] + " ");
            }
            System.out.println(" ");
        }

    }

}
