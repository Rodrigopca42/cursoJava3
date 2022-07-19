package arrays;

import java.util.Scanner;

import javax.swing.JOptionPane;

public class Aprovados {
    public static void main(String[] args) {
        
        int i, n;
        float media;

        String[] nome = new String[10];
        float[] nota1 = new float[10];
        float[] nota2 = new float[10];
        
        

        String n1 = JOptionPane.showInputDialog("Quantos Alunos Serão Digitados?");
        n = Integer.parseInt(n1);

        Scanner tec = new Scanner(System.in);

        for(i = 0; i < n; i++){
            System.out.println("Digite nome e as notas do "+(i + 1)+"º aluno:");    
            nome[i] = tec.nextLine();
            nota1[i] = tec.nextFloat();
            nota2[i] = tec.nextFloat();
            System.out.println(" ");
            tec.nextLine();
        }
        tec.close();    

     //soma entre vetores.
        System.out.println("ALUNOS APROVADOS");
        for(i = 0; i < n; i++){
            media = (nota1[i] + nota2[i]) / 2;
            if( media >= 6.0){
                System.out.println(nome[i]);            
            }
        }

      
            
        
    }
}
