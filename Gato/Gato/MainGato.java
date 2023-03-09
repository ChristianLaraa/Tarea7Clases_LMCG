import java.awt.*;

public class MainGato {
    public static void main(String[] args) {
        Gato gato1 = new Gato("Botas", "Mestizo",2, Color.ORANGE, "Feliz");
        Gato gato2 = new Gato();
        gato2.setNombre("Ernesto");
        gato2.setRaza("Persa");
        gato2.setEdad(15);
        gato2.setColor(Color.GRAY);
        gato2.setAnimo("Feliz");

        System.out.println(gato1.toString());
        System.out.println(gato2.toString());

        gato1.reganio();
        gato2.alimentar();
        gato2.acariciar();
    }
}