public class Banco {
    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public float getPorcent() {
        return porcent;
    }

    public void setPorcent(float porcent) {
        this.porcent = porcent;
    }

    public double valor;
    public float porcent;
    double calcTaxJur(){
        return (valor * (porcent/100));
    }
}
