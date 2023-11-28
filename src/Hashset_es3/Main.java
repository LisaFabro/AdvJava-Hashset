package Hashset_es3;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    //Scrivere una funzione che restituisca un hashset riempito
    //Creare un oggeto dello stesso tipo inserito nell'HashSet e popolarlo
    //Scorrere il set, per ogni elemento verificare se è uguale all'oggetto creato ed eliminarlo
    //Svuotare l'hashset, verificarlo e stampare il risultato
    public static void main(String[] args) {
        Shape shape1 = new Shape("Cerchio");

        Set<String> firstList = createHashset();
        System.out.println("Lista completa: " + firstList);

        Iterator<String> iterator = firstList.iterator();
        while(iterator.hasNext()) {
            String element = iterator.next();
            if(element == shape1.shape){
                iterator.remove();
            }
        }
        System.out.println("Lista filtrata: " + firstList);

    }
    public static Set<String> createHashset(){
        Set<String> resultSet = new HashSet<String>();
        resultSet.add("Triangolo");
        resultSet.add("Rettangolo");
        resultSet.add("Cerchio");
        return resultSet;
    }
}
