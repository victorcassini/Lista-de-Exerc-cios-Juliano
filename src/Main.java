import builders.PizzaBuilder;
import entidades.Pizza;

public class Main {
    public static void main(String[] args) {

        executarRefatorado();
    }

    private static void executarRefatorado(){

        Pizza Calabresa = new PizzaBuilder()
                .setMassa("Integral")
                .setTamanho("G")
                .setSabor("Calabresa")
                .setIngredinte("Cebola")
                .build();


        System.out.println(Calabresa.toString());

    }

}