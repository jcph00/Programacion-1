package Banco;

public record Cliente(String nombre, String cedula, Cuenta cuenta) {
    @Override
    public String toString() {
        return "Cliente: " + this.nombre + ", Cedula: " + this.cedula;
    }
}

/* 
public class Cliente {
    private String nombre;
    private String cedula;
    private Cuenta cuenta;

    public Cliente(String nombre, String cedula) {
        this.nombre = nombre;
        this.cedula = cedula;
    }

    public Cuenta getCuenta() {
        return cuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }
    

    @Override
    public String toString() {
        return "Cliente: " + this.nombre + ", Cedula: " + this.cedula;
    }
    
}
*/