import java.util.Arrays;
import java.util.HashSet;

public class Hashset_es1 {
    //Scrivere una funzione che restituisca un hashset riempito
    //Leggere l'hashSet e stampre grandezza ed elementi
    public static void main(String[] args){

        System.out.println("Contenuto hashset: " + createHashset() + " e conta " + createHashset().size() + " parole");
    }
    public static HashSet<String> createHashset(){
        return new HashSet<String>(Arrays.asList("questa", "è", "una", "stringa", "non", "ordinata"));
    }
}