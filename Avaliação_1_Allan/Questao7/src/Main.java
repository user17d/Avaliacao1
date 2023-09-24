public class Main {
    public static void main(String[] args) {
        Banco calc = new Banco();

        calc.porcent = 16.8f;
        calc.setValor(850);

        System.out.println(calc.calcTaxJur());
    }
}