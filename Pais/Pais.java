public class Pais {

    private String nombre;
    private String continente;
    private int poblacion;

    public Pais() {
        this.nombre = "";
        this.continente = "";
        this.poblacion = 0;
    }

    public Pais(String nombre, String continente, int poblacion) {
        this.nombre = nombre;
        this.continente = continente;
        this.poblacion = poblacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContinente() {
        return continente;
    }

    public void setContinente(String continente) {
        this.continente = continente;
    }

    public int getPoblacion() {
        return poblacion;
    }

    public void setPoblacion(int poblacion) {
        this.poblacion = poblacion;
    }

    @Override
    public String toString() {
        return "Pais{" +
                "nombre='" + nombre + '\'' +
                ", continente='" + continente + '\'' +
                ", poblacion=" + poblacion +
                '}';
    }

    public void dictadura() {
        this.nombre = "Republica socialista Mexicana";
        System.out.println("Tu pais " + this.nombre + " entro a una dictadura y su presidente decidio cambiarle el nombre a " + this.nombre);
    }
        public void mortalidad() {
            this.poblacion -= 1000;
            System.out.println("en " + this.nombre + " La mortalidad aumento un 500%, por lo tanto su poblacion es de " + this.poblacion);
        }

}
