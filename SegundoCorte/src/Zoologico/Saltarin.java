package Zoologico;

public class Saltarin extends Animal {

    private int alturaSalto;

    public Saltarin(String nombre, String codigo, String taxonomia, String color, String sexo, byte edad, int alturaSalto) {
        super(nombre, codigo, taxonomia, color, sexo, edad);
        this.alturaSalto = alturaSalto;
    }

    public int getAlturaSalto() {
        return alturaSalto;
    }

    public void setAlturaSalto(int alturaSalto) {
        this.alturaSalto = alturaSalto;
    }

    public void saltar() {
        System.out.println("El saltarín salta a una altura de " + alturaSalto + " metros.");
    }

    @Override
    public String hacerSonido() {
        return "El saltarín hace un sonido característico.";
    }
    
}
