import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class App {
    public static void main(String[] args) {
       
        List<String> list = new ArrayList<>();

        list.add("Maria");
        list.add("Ola");
        list.add("Salve");
        list.add("Correto");
        list.add("Ordenado");

        list.add(2, "Marco");
        


        for (String obj : list) {
            System.out.println(obj);
        }
        System.out.println("------------------");

       
        list.removeIf(x -> x.charAt(0) == 'M');

        for (String obj : list) {
            System.out.println(obj);
        }
        
        System.out.println("------------------");
        System.out.println("Index of Ola: " + list.indexOf("Ola"));

        System.out.println("------------------");
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'g').collect(Collectors.toList());
        System.out.println(result);



        System.out.println("------------------");
        String name = list.stream().filter(x -> x.charAt(0) == 'O').findFirst().orElse(null);
        System.out.println(name);
    }




}
