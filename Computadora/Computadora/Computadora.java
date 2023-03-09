public class Computadora {
   private String tipo;
   private String so;
   private double precio;

   public Computadora(){
       this.tipo = "";
       this.so = "";
       this.precio = 0;
   }
   public Computadora (String tipo, String so, double precio){
       this.tipo = tipo;
       this.so = so;
       this.precio = precio;
   }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getSo() {
        return so;
    }

    public void setSo(String so) {
        this.so = so;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Computadora{" +
                "tipo='" + tipo + '\'' +
                ", so='" + so + '\'' +
                ", precio=" + precio +
                '}';
    }

   public void comodidad (){
       this.tipo = "Laptop";
       System.out.println("El usuario busca comodidad, por lo tanto lo que le recomendamos es: " + this.tipo);
   }
   public void linux (){
       this.so = "Linux";
       System.out.println("El usuario busca navegar por el sistema operativo de manera rapida y eficiente no le importa la interfaz, por lo tanto el so quie le recomendamos es: " + this.so);
   }
}