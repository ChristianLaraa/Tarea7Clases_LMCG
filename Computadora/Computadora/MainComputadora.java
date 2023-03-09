import java.awt.*;
public class MainComputadora {
    public static void main(String[] args){

        Computadora computadora1 = new Computadora("PC Gamer", "Windows", 17899);
        Computadora computadora2 = new Computadora();
        computadora2.setTipo("Laptop");
        computadora2.setSo("ios");
        computadora2.setPrecio(33999);

        System.out.println(computadora1.toString());
        System.out.println(computadora2.toString());

        computadora1.comodidad();
        computadora2.linux();

    }
}
