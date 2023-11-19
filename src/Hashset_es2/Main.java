package Hashset_es2;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Main {
    //Scrivere una funzione che restituisca un HashSet riempito
    //Creare un oggetto dello stesso tipo inserito nell'HashSet e popolarlo
    //Verificare che l' elemento sia parte del Set e stampare il risultato
    public static void main(String[] args) {
        Numbers number = new Numbers(6);

        if(createHashset().contains(number)){
            System.out.println("Il valore inserito è contenuto nell'hashset");
        }else{
            System.out.println("Il valore inserito non è contenuto nell'hashset");
        }
    }
    public static Set<Integer> createHashset(){
        Set<Integer> resultSet = new HashSet<Integer>();
        resultSet.add(3);
        resultSet.add(6);
        resultSet.add(89);
        resultSet.add(99);
        return resultSet;
    }
}
