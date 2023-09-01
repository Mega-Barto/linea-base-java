public class Main {
    public static void main(String[] args) {
        Arceus humilde = new Arceus("Humilde",4,2.5F,"Desconocido",400,255);
        Bulbasaur kiddo = new Bulbasaur("kiddo", 1,7,"Macho",100,130);

        kiddo.setDebilidades();

        humilde.attack(kiddo, humilde.getAtaque());

    }
}