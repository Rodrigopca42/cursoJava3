package arrays;

import java.util.Scanner;

public class Comerciante {
    
    public static void main(String[] args) {
        
        int i, n,abaixo, entre, acima;
        float lucro, lucroPercent;

        String[] nome = new String[10];
        float[] compra = new float[10];
        float[] venda = new float[10];

        Scanner tec = new Scanner(System.in);

        System.out.print("Quantos Produtos Serão Digitados? ");
        n = tec.nextInt();

        for(i = 0; i < n; i++){
            System.out.println("PRODUTO "+ (i + 1)+ ": ");
            System.out.print("NOME: ");
            nome[i] = tec.nextLine();
            tec.nextLine();
            System.out.print("COMPRA: ");
            compra[i] = tec.nextFloat();
            System.out.print("VENDA: ");
            venda[i] = tec.nextFloat();
        }
        tec.close();

        // for(i = 0; i < n; i++)        
    
        abaixo = 0;
        entre = 0;
        acima = 0;
        lucro = 0;
        for(i = 0; i < n; i++){
            lucro += venda[i] - compra[i];
            lucroPercent = lucro * 100 / compra[i];//cálculo feito para achar a porcentagem de lucro.
            if(lucroPercent < 10){
                abaixo++;
                
            }else if(lucroPercent <= 20){
                entre++;
            }else{
                acima++;
            }
        }

        float totcompra = 0;
        float totvenda = 0;
        for(i = 0; i < n; i++) {
            totcompra += compra[i];
            totvenda += venda[i];
        }



        System.out.println(" ");
        System.out.println("RELATÓRIO: ");
        System.out.println("Lucro Abaixo de 10%: "+ abaixo);
        System.out.println("Lucro Entre 10% e 20%: "+ entre);
        System.out.println("Lucro Acima de 20%: "+ acima);
        System.out.printf("Valor total de compra: R$%.2f%n", totcompra);
        System.out.printf("Valor total de venda: R$%.2f%n", totvenda);
        System.out.printf("Lucro total: R$%.2f%n", lucro);
        System.out.println(" ");
       




    }
}
