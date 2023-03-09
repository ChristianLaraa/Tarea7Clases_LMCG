public class Giroscopio {

    private String sensor;
    private String marco;
    private double tamano;

    public Giroscopio (){
        this.sensor = "";
        this.marco = "";
        this.tamano = 0;
    }
    public Giroscopio(String sensor, String marco, double tamano){
        this.sensor = sensor;
        this.marco = marco;
        this.tamano = tamano;
    }

    public String getSensor() {
        return sensor;
    }

    public void setSensor(String sensor) {
        this.sensor = sensor;
    }

    public String getMarco() {
        return marco;
    }

    public void setMarco(String marco) {
        this.marco = marco;
    }

    public double getTamano() {
        return tamano;
    }

    public void setTamano(double tamano) {
        this.tamano = tamano;
    }

    @Override
    public String toString() {
        return "Giroscopio{" +
                "sensor='" + sensor + '\'' +
                ", marco='" + marco + '\'' +
                ", tamano=" + tamano +
                '}';
    }
  public void rotatorio(){
        this.sensor = "Rotatorio";
      System.out.println("Llegaron materiales importados, por lo tanto el sensor que se utilizara es: " + this.sensor);
  }
  public void plata(){
        this.marco = "Plata";
      System.out.println("Requerimos que el marco sea muy resistente por lo tanto el material que utilizaremos es " + this.marco);
  }

}