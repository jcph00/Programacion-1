package EjerciciosPrimerParcial;

public class Combo {
    private double precio;
    private String nombre;

    public Combo (double precio, String nombre){
        this.precio = precio;
        this.nombre = nombre;
    }
    
    public double getPrecio(){
        return this.precio;
    }
    public String getNombre(){
        return this.nombre;
    }
}
