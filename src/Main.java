import javax.crypto.spec.PSource;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {

    /**
     *- Exercici 3
     * Crea una llista amb els noms dels mesos de l’any. Imprimeix tots els elements
     * de la llista amb una lambda.
     * - Exercici 4
     * Fer la mateixa impressió del punt anterior, però mitjançant
     * method reference.
     * @param args
     */
    public static void main(String[] args){
        List<String> yearMonths = new ArrayList<>(Arrays.asList("January","February","March","April","May","June","July","August","September","October","November","December"));
        // Exercici 3
        System.out.println("Lambda: ");
        yearMonths.forEach(month -> System.out.print(month + "/"));
        System.out.print("\n\n");
        // Exercici 4
        System.out.println("Method reference: ");
        yearMonths.forEach(System.out::print);
        System.out.print("\n\n");

        System.out.println("Own method reference: ");
        yearMonths.forEach(printarClass::printar);
    }
}

class printarClass{
    public static void printar(Object obj){
        System.out.print(" > " + obj.toString());
    };
}
