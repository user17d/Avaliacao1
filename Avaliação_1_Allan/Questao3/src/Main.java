public class Main {
    public static void main(String[] args) {
        ContaBancaria dinheiro = new ContaBancaria();

        dinheiro.setSaldo(0);
        dinheiro.setDepositar(500);
        dinheiro.setSacar(100);

        double S = dinheiro.getSaldo() + dinheiro.Depositar;

        double operar = S - dinheiro.Sacar;

        if(operar>=0){
            System.out.println("Valor sacado: " + dinheiro.Sacar);

            System.out.println("Resto na Conta: " + operar);
        } else {
            System.out.println("Saldo Insuficiente");
        }

    }
}