package arrays;

import java.util.Arrays;
import java.util.Scanner;

public class Desafio1 {
    public static void main(String[] args) {
        int n, i;
        

        Scanner tec = new Scanner(System.in);

        System.out.print("Digite quantas notas vai informar: ");
        n = tec.nextInt();

        double[] nota = new double[n];

        for(i = 0; i < nota.length; i++){
            System.out.print("Digite a nota "+ (i + 1) +": ");
            nota[i] = tec.nextDouble();
        }
        
        double somaNota = 0;
        for(double soma: nota){
            somaNota += soma;
        }

        System.out.printf("A Soma das Notas é %.1f", somaNota);
        System.out.println(" ");
        double media = somaNota / nota.length;
        System.out.printf("A Média das Notas é = %.1f", media);
        System.out.println(" ");
    }
}
