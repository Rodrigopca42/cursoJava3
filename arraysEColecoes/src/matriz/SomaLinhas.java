package matriz;

import java.util.Scanner;

public class SomaLinhas {
    
    public static void main(String[] args) {
        
        int m, n, i, j;

        float[][] mat = new float[10][10];
        float[] vet = new float[10];
            Scanner tec= new Scanner(System.in);

            System.out.print("Digite a quantidade de linhas da matriz: ");
            m = tec.nextInt();

            System.out.print("Digite a quantidade de colunas da matriz: ");
            n = tec.nextInt();

            for(i = 0; i < m; i++){
                System.out.println("Digite os elementos da "+ (i + 1) +"ª linha: ");
                for(j = 0; j < n; j++){
                    mat[i][j] = tec.nextFloat();
                }
            }
            tec.close();

            System.out.println("Vetor Gerado:");
            for(i = 0; i < m; i++){
                vet[i] = 0;
                for(j =0; j < n; j++){
                    vet[i] += mat[i][j];
                }
                System.out.println(vet[i]);
            }
            
    }
}
