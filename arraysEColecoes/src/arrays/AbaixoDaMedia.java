package arrays;

import java.util.Scanner;
import javax.swing.JOptionPane;

public class AbaixoDaMedia{

        public static void main(String[] args) {
            
            int i, n;

            String n1 = JOptionPane.showInputDialog("Quantos Elementos Vai Ter o Vetor?");

            n = Integer.parseInt(n1);

            float[] notas = new float[10];

            Scanner tec = new Scanner(System.in);

            float soma = 0;
            for( i = 0; i < n; i++){
                System.out.print("Digite o " + (i + 1)+ "º Número:");
                notas[i] = tec.nextFloat();
                soma += notas[i];
            }
            tec.close();

            float media = soma / n;

            System.out.println(" ");
            System.out.printf("A MÉDIA DO VETOR: %.3f%n", media);
            System.out.println(" ");

            System.out.println("ELEMENTOS ABAIXO DA MÉDIA:");
            for(i = 0; i < n; i++){
                if(notas[i] < media){
                System.out.println(notas[i]);
                }
            }
            System.out.println(" ");

        }

}