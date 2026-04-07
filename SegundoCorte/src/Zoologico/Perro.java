package Zoologico;

public class Perro extends Saltarin {

    private String raza;

    public Perro(String nombre, String codigo, String taxonomia, String color, String sexo, byte edad, String raza) {
        super(nombre, codigo, taxonomia, color, sexo, edad, 0); // Se pasa 0 como altura de salto, ya que no se utiliza en esta implementación
        this.raza = raza;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }    

    @Override
    public String hacerSonido() {
        return "El perro hace guau";
    }    
}
