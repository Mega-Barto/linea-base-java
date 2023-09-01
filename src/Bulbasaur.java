public class Bulbasaur {
    private int codigo = 1;
    private String nombre;
    private String[] tipos = {"Planta", "Veneno"};
    private double altura = 0.7;
    private float peso = 6.9F;
    private String sexo;
    private String[] debilidades = new String[4];
    private int vida;
    private int ataque;

    //constructores
    public Bulbasaur(String nombre, double altura, float peso, String sexo, int vida, int ataque) {
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

    public String[] getDebilidades() {
        return debilidades;
    }

    public void setDebilidades() {
        this.debilidades[0] = "Volador";
        this.debilidades[0] = "Fuego";
        this.debilidades[0] = "Hielo";
        this.debilidades[0] = "Psiquico";
    }

    public String getNombre() {
        return nombre;
    }

    public void damage(int ataque) {
        vida = vida - ataque;
    }
}
