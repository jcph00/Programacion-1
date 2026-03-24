package Zoologico;

public class Perro extends Animal {

    private String raza;

    public Perro(String nombre, String codigo, String taxonomia, String color, String sexo, byte edad, String raza) {
        super(nombre, codigo, taxonomia, color, sexo, edad);
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
