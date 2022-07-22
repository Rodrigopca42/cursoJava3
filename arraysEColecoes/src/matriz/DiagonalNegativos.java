package matriz;

import java.util.Scanner; 

public class DiagonalNegativos {
    
    public static void main(String[] args) {
        
        int n, i, j;

        int[][] mat = new int[10][10];

        Scanner tec = new Scanner(System.in);

        System.out.print("Qual a ordem da matriz? ");
        n = tec.nextInt();

        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                System.out.print("Elemento ["+i+ ", "+j+"]: ");
                mat[i][j] = tec.nextInt();
            }
        }
        tec.close();
        
       System.out.println("Diagonal Principal:");
       for(i = 0; i < n; i++){
        System.out.print(mat[i][i]+ " ");
       }

       
        System.out.println(" ");
       int cont = 0;
       for(i = 0; i < n; i++){
        for(j = 0; j < n; j++){
            if(mat[i][j] < 0){
                cont++;
            }
        }
       }
        System.out.println("Quantidade de Negativos: "+ cont);
    }

}
