package arrays;

import java.util.Arrays;

public class ExercicioForeach {
    public static void main(String[] args) {
        
        double[] notasAlunoA = new double[4];
        System.out.println(Arrays.toString(notasAlunoA));

        notasAlunoA[0] = 7.9;
        notasAlunoA[1] = 8;
        notasAlunoA[2] = 6.7;
        notasAlunoA[3] = 9.7;

        System.out.println(Arrays.toString(notasAlunoA));
        System.out.println(notasAlunoA[0]);
        System.out.println(notasAlunoA[notasAlunoA.length - 1]);
       // System.out.println(notasAlunoA[4]);  ERRO!

        double totalAlunoA = 0;
        /*
         * for(int i = 0; i < notasAlunoA.length; i++){
         * totalAlunoA += notasAlunoA[i];
         * }
         */

         for(double notaA: notasAlunoA){
            totalAlunoA += notaA;
         }

        System.out.println(totalAlunoA / notasAlunoA.length);

        double[] notasAlunoB ={6.9, 8.9, 5.5, 10};

        double totalAlunoB = 0;
        /*
         * for(int i = 0; i < notasAlunoB.length; i++){
         * totalAlunoB += notasAlunoB[i];
         * }
         */

        for(double notaB: notasAlunoB){
            totalAlunoB += notaB;
         }
         
        System.out.println("A media do aluno B = " + totalAlunoB / notasAlunoB.length);
    }
}
