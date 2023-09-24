public class Animal {
    public static void main(String[] args) {
        Animal animal = new Animal();
        cachorro dog = new cachorro();
        gato cat = new gato();

        animal.fazerBarulho();
        dog.fazerBarulho();
        cat.fazerBarulho();
    }

    public void fazerBarulho() {
        System.out.println("Animal fazendo barulho");
    }
}