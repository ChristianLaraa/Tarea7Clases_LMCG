import java.awt.*;
public class MainCuboRubik {
    public static void main(String[] args){

        CuboRubik cubo1 = new CuboRubik("Cuadrado", "4 colores", 26);
        CuboRubik cubo2 = new CuboRubik();
        cubo2.setTipo("Esfera");
        cubo2.setPatron("4 colores");
        cubo2.setPiezas(48);

        System.out.println(cubo1.toString());
        System.out.println(cubo2.toString());

        cubo1.prototipo();
        cubo2.extenso();

    }



}
