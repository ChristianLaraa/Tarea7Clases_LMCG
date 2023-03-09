public class Libro {

    private String genero;
    private int paginas;
    private String editorial;

    public Libro (){
        this.genero = "";
        this.paginas = 0;
        this.editorial = "";
    }
    public Libro(String genero, int paginas, String editorial){
        this.genero = genero;
        this.paginas = paginas;
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    @Override
    public String toString() {
        return "Libro{" +
                "genero='" + genero + '\'' +
                ", paginas=" + paginas +
                ", editorial='" + editorial + '\'' +
                '}';
    }
    public void literario(){
        this.genero = "Novela";
        System.out.println("El genero consiste en una historia extensa con el objetivo de evocar sentimientos, es: " + this.genero);
    }
    public void paidos(){
        this.editorial = "Paidos";
        System.out.println("La mejor editorial para novelas, ya que hace buena traduccion y es de buena calidad es: " + this.editorial);
    }
}