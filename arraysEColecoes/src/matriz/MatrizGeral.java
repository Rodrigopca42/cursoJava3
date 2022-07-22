package matriz;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class MatrizGeral {
    

    /*
     * Programa que lê uma matriz quadrada de ordem N, contendo números reais, em * seguida fazer as seguites ações:
     *  
     * a)- Calcular e imprimir a soma de todos os elementos positivos da matriz.
     * 
     * b)- Fazer a leitura do índice de uma linha da matriz e, daí , imprimir
     * todos os elementos desta linha.
     * 
     * c)- Fazer a leitura do índice de uma coluna da matriz e, daí,  imprimir
     * todos os elementos desta coluna.
     * 
     * d)- Imprimr os elementos da diagonal principal da matriz.
     * 
     * e)- Alrerar a matriz elevando ao quadrado todos os números negativos da
     * mesma, em seguida imprimir a matriz alterada.
     */

    public static void main(String[] args) {

        int n, i, j;

        float[][] num = new float[10][10];

        String n1 = JOptionPane.showInputDialog("Qual é a ordem da matriz?");
        n = Integer.parseInt(n1);

        Scanner tec = new Scanner(System.in);

        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                System.out.print("Elemento ["+i+", "+j+"]: ");
                num[i][j] = tec.nextFloat();
            }
        }
        
        System.out.println(" ");
        float soma = 0;
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                if( num[i][j] > 0){
                    soma += num[i][j];
                }
            }
        }
        System.out.printf("SOMA DOS POSITIVOS: %.1f", soma);
        System.out.println(" ");


        System.out.println(" ");
        System.out.print("Escolha uma linha: ");
        int linha = tec.nextInt();
        System.out.print("LINHA ESCOLHIDA: ");
        for(j = 0; j < n; j++){
            System.out.print(num[linha][j]+" ");
        }
        System.out.println(" ");
        
        System.out.println(" ");
        System.out.print("Escolha uma coluna: ");
        int coluna = tec.nextInt();
        System.out.print("COLUNA ESCOLHIDA: ");
        for(i = 0; i< n; i++){
            System.out.print(num[i][coluna] +" ");
        }
        tec.close();
        System.out.println(" ");
        
        
        System.out.println(" ");
        System.out.print("DIAGONAL PRINCIPAL: ");
        for(i = 0; i < n; i++){
            System.out.print(num[i][i] + " ");
        }

        System.out.println(" ");
        System.out.println(" ");
        System.out.println("MARIZ ALTERADA:");
        
        for(i = 0; i < n; i++){
            for(j = 0; j < n; j++){
                if(num[i][j] < 0){
                  num[i][j] = (float)Math.pow(num[i][j], 2);
                }
                System.out.print(num[i][j]+" ");
            }
            System.out.println(" ");
        }
        System.out.println(" ");

        }
        
        
        
    }

