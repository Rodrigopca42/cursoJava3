package colecoes;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedMap;
import java.util.SortedSet;
import java.util.TreeSet;

public class ConjuntoComportado {
    
    public static void main(String[] args) {
        
        Set<String> listaAprovados = new HashSet<>();

        listaAprovados.add("Ana");
        listaAprovados.add("Carlos");
        listaAprovados.add("Luca");
        listaAprovados.add("Pedro");

        for(String candidato: listaAprovados)
        System.out.println(candidato);

        SortedSet<Integer> num = new TreeSet<>();

        num.add(1);
        num.add(32);
        num.add(53);
        num.add(6);

        for(int numero: num){
            System.out.println(numero);
        }
    }
}
