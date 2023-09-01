import model.Alien;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }

    private static Alien firstAlien(){
        Alien alien = new Alien();
        String[] dna = {"A", "D", "N"};
        alien.setDna(dna);
        return alien;
    }
}