import java.awt.*;
public class MainLibro {

    public static void main(String[] args){

       Libro libro1 = new Libro("Educativo-interactivo", 239, "Person");
       Libro libro2 = new Libro();
        libro2.setGenero("Cuento");
        libro2.setEditorial("Anagrama");
        libro2.setPaginas(189);

        System.out.println(libro1.toString());
        System.out.println(libro2.toString());

        libro1.literario();
        libro2.paidos();

    }
}
