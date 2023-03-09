import java.awt.*;
public class MainPais {
    public static void main(String[] args){

        Pais pais1 = new Pais("Mexico", "America", 126589632);
        Pais pais2 = new Pais();
        pais2.setNombre("Jamaica");
        pais2.setContinente("America");
        pais2.setPoblacion(125668745);

        System.out.println(pais1.toString());
        System.out.println(pais2.toString());

        pais1.dictadura();
        pais2.mortalidad();

    }
}
