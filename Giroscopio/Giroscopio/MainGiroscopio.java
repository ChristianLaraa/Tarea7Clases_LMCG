import java.awt.*;
public class MainGiroscopio {
    public static void main(String[] args){

        Giroscopio giroscopio1 = new Giroscopio("Optico", "Aluminio", 15.5);
        Giroscopio giroscopio2 = new Giroscopio();
        giroscopio2.setSensor("Vibrador");
        giroscopio2.setMarco("Oro");
        giroscopio2.setTamano(22.3);

        System.out.println(giroscopio1.toString());
        System.out.println(giroscopio2.toString());

        giroscopio1.rotatorio();
        giroscopio2.plata();

    }



}




