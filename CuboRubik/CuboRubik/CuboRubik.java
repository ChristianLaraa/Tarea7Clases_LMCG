public class CuboRubik {
    private String tipo;
    private String patron;
    private int piezas;

    public CuboRubik() {
        this.tipo = "";
        this.patron = "";
        this.piezas = 0;
    }

    public CuboRubik(String tipo, String patron, int piezas) {
        this.tipo = tipo;
        this.patron = patron;
        this.piezas = piezas;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getPatron() {
        return patron;
    }

    public void setPatron(String patron) {
        this.patron = patron;
    }

    public int getPiezas() {
        return piezas;
    }

    public void setPiezas(int piezas) {
        this.piezas = piezas;
    }

    @Override
    public String toString() {
        return "CuboRubik{" +
                "tipo='" + tipo + '\'' +
                ", patron='" + patron + '\'' +
                ", piezas=" + piezas +
                '}';
    }

    public void prototipo() {
        this.tipo = "Triangular";
        System.out.println("Estamos diseñando un cubo que revolucione la forma de resolver el cubo, la forma es la siguiente: " + this.tipo);

    }
    public void  extenso(){
        this.piezas = 89;
        System.out.println("Pensamos en un cubo que rompa el record en el tiempo menor para resolverlo, para eso incluimos mas piezas: " + this.piezas);
    }
}