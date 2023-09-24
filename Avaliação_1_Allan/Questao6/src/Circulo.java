public class Circulo {
    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    private double raio;

    public double calcularArea(){
        return 3.14 * (raio * raio);
    }
}
