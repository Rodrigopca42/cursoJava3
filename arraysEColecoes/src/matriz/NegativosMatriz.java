package matriz;

import java.util.Scanner;

public class NegativosMatriz {
    
    public static void main(String[] args) {
        
        int m, n, i, j;

        int[][] mat = new int[10][10];
        
        Scanner tec = new Scanner(System.in);

        System.out.print("Digite a quantidade de linhas da matriz: ");
        m = tec.nextInt();

        System.out.print("Digite a quantidade de colunas da matriz: ");
        n = tec.nextInt();

        for(i = 0;i < m; i++){
            for(j = 0; j < n; j++){
                System.out.print("Elemento ["+i+", "+j+"]: ");
                mat[i][j] = tec.nextInt();
            }
        }
        tec.close();

        System.out.println("Valores Negativos:");
        for(i = 0; i < m; i++){
            for(j = 0; j < n; j++){
                if(mat[i][j] < 0){
                   System.out.println(mat[i][j]);
                }
            }
           }
    }
}
