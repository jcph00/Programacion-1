package Zoologico;

public class Gato extends Animal {
    
    private int numeroVidas;
    private int numeroBigotes;

    public Gato(String nombre, String codigo, String taxonomia, String color, String sexo, byte edad, int numeroVidas, int numeroBigotes) {
        super(nombre, codigo, taxonomia, color, sexo, edad);
        this.numeroVidas = numeroVidas;
        this.numeroBigotes = numeroBigotes;
    }

    public int getNumeroVidas() {
        return numeroVidas;
    }

    public void setNumeroVidas(int numeroVidas) {
        this.numeroVidas = numeroVidas;
    }

    public int getNumeroBigotes() {
        return numeroBigotes;
    }

    @Override

    public String hacerSonido(){
        return "El gato hace miau";
    }

}
