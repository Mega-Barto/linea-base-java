public class Arceus {
    private int codigo = 493;
    private String nombre;
    private String[] tipos = {"Normal"};
    private double altura = 3.2;
    private float peso = 320;
    private String sexo;
    private String[] debilidades;
    private int vida;
    private int ataque;

    //constructores

    public Arceus(String nombre, double altura, float peso, String sexo, int vida, int ataque) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.sexo = sexo;
        this.vida = vida;
        this.ataque = ataque;
    }

    //getter y setter


    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public int getVida() {
        return vida;
    }

    public void setVida(int vida) {
        this.vida = vida;
    }

    public int getAtaque() {
        return ataque;
    }

    public void setAtaque(int ataque) {
        this.ataque = ataque;
    }
}
