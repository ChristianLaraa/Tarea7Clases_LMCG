public class Balon {
  private String tipo;
  private String deporte;
  private String marca;

  public Balon(){
    this.tipo = "";
    this.deporte = "";
    this.marca = "";
  }
  public Balon (String tipo, String deporte, String marca){
    this.tipo = tipo;
    this.deporte = deporte;
    this.marca = marca;
  }

  public String getTipo() {
    return tipo;
  }

  public void setTipo(String tipo) {
    this.tipo = tipo;
  }

  public String getDeporte() {
    return deporte;
  }

  public void setDeporte(String deporte) {
    this.deporte = deporte;
  }

  public String getMarca() {
    return marca;
  }

  public void setMarca(String marca) {
    this.marca = marca;
  }

  @Override
  public String toString() {
    return "Balon{" +
            "tipo='" + tipo + '\'' +
            ", deporte='" + deporte + '\'' +
            ", marca='" + marca + '\'' +
            '}';
  }
  public void patear(){
    this.tipo = "Futbol";
    System.out.println("El balon es de " + this.tipo + " por ende es apto para poder ser pateado");
  }
  public void lanzar(){
    this.deporte = "Americano";
    System.out.println("En el futbol " + this.deporte + " si se puede lanzar el balon");
  }

}