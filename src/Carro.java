public class Carro {

    //Declaração de atributos
    String marca;
    String modelo;
    int ano;
    double valor;

   
    public String marca(){
        return "Ferrari";
    }

    public void modelo(){
        System.out.println("R8");
    }

    public void compra(){
        System.out.println("Compra realizada com sucesso!");
    }
    
}
