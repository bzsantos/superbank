import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {


        Animal animal = new Animal(null, null);

  //      animal.setRaca("Pastor");
  //      animal.setOrigem("Alemanha");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a raça do animal:");
        String raca = scanner.nextLine();

        System.out.println("Digite a origem do animal:");
        String origem = scanner.nextLine();

        System.out.println("Animal inserido: " + insereAnimal(raca, origem));
          
    
    }


    public static String insereAnimal(String raca, String origem) {

        List<Animal> lista = new ArrayList<>();
        lista.add(new Animal(raca, origem));

        return lista.toString();
    }





    
}
