package arrays;

import java.util.Scanner;

public class DadoPessoas {
    public static void main(String[] args) {
        
        int i, n, posmaior, posmenor;
        float maior, menor;
        
        float[] altura = new float[20];
        char[] genero = new char[20];
        
        Scanner tec =  new Scanner(System.in);
        
        System.out.print("Quantas Pessoas Serão Digitadas? ");
        n = tec.nextInt();

        for(i = 0; i < n; i++){
            System.out.print("Altura da "+ (i + 1)+ "° Pessoa: ");
            altura[i] = tec.nextFloat();
            System.out.print("Gênero da "+ (i + 1)+ "° Pessoa: ");
            genero[i] = tec.next().charAt(0);
            tec.nextLine();
        }
        tec.close();

        menor = altura[0];
        posmenor = 0;
        for(i = 1; i < n; i++){
            if(altura[i] < menor){
                menor = altura[i];
                posmenor = i;
            }
        }
        System.out.printf("MENOR ALTURA: %.2f%n", menor);
        
        maior = altura[0];
        posmaior = 0;
        for(i = 1; i < n; i++){
            if( altura[i] > maior){
                maior = altura[i];
                posmaior = i;
            }
        }
        System.out.printf("MAIOR ALTURA: %.2f%n",maior);

        /*
         *  Esse for tem a função de fazer a comparação da letra "f" como o esta
         * gravado no vetor genero, no caso da condicional ser verdadeira, a soma e 
         * a posição fazem uma adição, mas, ainda não tenho a resposta para esse problema.
        */


        /*
        *    float soma = 0;
        *    int nPosicao = 0;
        *    for(i = 0; i < n; i++){
        *    if(genero[i].equalsI("f")){
        *            soma += altura[i];
        *            nPosicao++;
        *        }
        *    }
        *    float mediaAlturaMulher = soma / nPosicao;
        *    System.out.printf("Média das Alturas das Mulheres: %.2f%n", mediaAlturaMulher);
        *    
        *    
        *    int nHomens = n - nPosicao;
            
        *    System.out.printf("NÚMERO DE HOMENS: %.2f%n",nHomens);
        */

    }
}
