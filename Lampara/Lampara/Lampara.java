public class Lampara {
  private String tipo;
  private String color;
  private int tamano;

  public Lampara (){
      this.tipo = "";
      this.color = "";
      this.tamano = 0;
  }
  public Lampara(String tipo, String color, int tamano){
      this.tipo = tipo;
      this.color = color;
      this.tamano = tamano;
  }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Lampara{" +
                "tipo='" + tipo + '\'' +
                ", color='" + color + '\'' +
                ", tamano=" + tamano +
                '}';
    }

    public void encender (){
      this.tipo = "Led, fria";
        System.out.println("Favor de encender la lampara de " + this.tipo);
    }
    public void apagar (){
      this.color = "Blanca";
        System.out.println("Apague la lampara " + this.color);
    }
}