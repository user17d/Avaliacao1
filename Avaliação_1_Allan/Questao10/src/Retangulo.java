public class Retangulo extends Shape {
    double b = 5;
    double h = 20;

    public double AR () {
        return b * h;
    }
    public double PR () {
       return  2 * (b + h);
    }
}
