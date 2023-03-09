import java.awt.*;
public class MainBalon {

    public static void main(String[] args){

        Balon balon1 = new Balon("Furbol de cuero", "Soccer", "Adidas");
        Balon balon2 = new Balon();
        balon2.setTipo("Basquet aereodinamico");
        balon2.setDeporte("Basquetbol");
        balon2.setMarca("Wilson");

        System.out.println(balon1.toString());
        System.out.println(balon2.toString());

        balon1.patear();
        balon2.lanzar();

    }

}
