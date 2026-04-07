package Zoologico;

public class Gato extends Saltarin {
    
    private int numeroVidas;
    private int numeroBigotes;

    public Gato(String nombre, String codigo, String taxonomia, String color, String sexo, byte edad, int numeroVidas, int numeroBigotes) {
        super(nombre, codigo, taxonomia, color, sexo, edad, 0); // Se pasa 0 como altura de salto, ya que no se utiliza en esta implementación
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

    public void irArenero() {
        System.out.println("El gato va al arenero.");
    }

    @Override

    public String hacerSonido(){
        return "El gato hace miau";
    }

}
