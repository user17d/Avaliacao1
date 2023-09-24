public class Main {
    public static void main(String[] args) {

        Estudante aluno = new Estudante();
        Pessoa P = new Pessoa();

        P.setIdade(16);
        P.setNome("Petrus Henrick");

        System.out.println(P.getIdade());
        System.out.println(P.getNome());
    }
}