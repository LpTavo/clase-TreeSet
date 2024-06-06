import java.util.TreeSet;
import java.util.Set;

public class EjemploTreeSet {
    public static void main(String[] args) {
        
        Set<Integer> numeros = new TreeSet<>();
        
   
        numeros.add(10);
        numeros.add(5);
        numeros.add(20);
        numeros.add(15);
        numeros.add(10); 
        
     
        System.out.println("Elementos en el conjunto ordenado: " + numeros);
        
       
        System.out.println("Primer elemento en el conjunto: " + ((TreeSet<Integer>) numeros).first());
        
       
        System.out.println("Último elemento en el conjunto: " + ((TreeSet<Integer>) numeros).last());
        
     
        Set<Integer> subConjunto = ((TreeSet<Integer>) numeros).subSet(5, 16);
        System.out.println("Subconjunto de elementos entre 5 y 15: " + subConjunto);
        
      
        Set<Integer> tailSet = ((TreeSet<Integer>) numeros).tailSet(10);
        System.out.println("Subconjunto de elementos mayores o iguales a 10: " + tailSet);
    }
}
