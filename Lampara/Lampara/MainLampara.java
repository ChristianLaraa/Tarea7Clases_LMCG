import java.awt.*;
public class MainLampara {

    public static void main(String[] args){

        Lampara lampara1 = new Lampara("Led", "Blanco", 30);
        Lampara lampara2 = new Lampara();
        lampara2.setTipo("Led");
        lampara2.setColor("Naranja");
        lampara2.setTamano(42);

        System.out.println(lampara1.toString());
        System.out.println(lampara2.toString());

        lampara1.encender();
        lampara2.apagar();

    }

}
