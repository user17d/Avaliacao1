public class Shape {
    Circulo rim = new Circulo();
    Retangulo ret = new Retangulo();

    public void Area(){
        System.out.println(rim.AC());
        System.out.println(ret.AR());
    }
    public void Perimetro(){
        System.out.println(rim.PC());
        System.out.println(ret.PR());
    }
}

