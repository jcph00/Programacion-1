

import java.util.ArrayList;

/**
 * Clase que representa al cliente del taller.
 * Según el diagrama, tiene una relación de uno a muchos con Bicicleta.
 */
public class Cliente {
    private String nombre;
    private String identificacion;
    private int telefono; // Mantuvimos 'int' según tu diagrama inicial
    private String direccion;
    
    // Lista para manejar la composición con Bicicleta
    private ArrayList<Bicicleta> listaBicicletas;

    /**
     * Constructor para inicializar al cliente.
     * Es vital inicializar el ArrayList aquí para evitar errores de puntero nulo.
     */
    public Cliente(String nombre, String identificacion, int telefono, String direccion) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.telefono = telefono;
        this.direccion = direccion;
        this.listaBicicletas = new ArrayList<>();
    }

    // --- MÉTODOS LÓGICOS DEL DIAGRAMA ---

    /**
     * Agrega una bicicleta a la lista del cliente y establece el vínculo.
     * @param bici Objeto Bicicleta ya creado.
     */
    public void agregarBicicleta(Bicicleta bici) {
        this.listaBicicletas.add(bici);
        // Aprovechamos para vincular al dueño dentro de la bici (bidireccional)
        bici.vincularDueño(this);
    }

    // --- GETTERS Y SETTERS ---

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getIdentificacion() { return identificacion; }
    public void setIdentificacion(String identificacion) { this.identificacion = identificacion; }

    public int getTelefono() { return telefono; }
    public void setTelefono(int telefono) { this.telefono = telefono; }

    public String getDireccion() { return direccion; }
    public void setDireccion(String direccion) { this.direccion = direccion; }

    public ArrayList<Bicicleta> getListaBicicletas() { return listaBicicletas; }

    // --- REPRESENTACIÓN VISUAL ---

    @Override
    public String toString() {
        return String.format("Cliente: %-15s | ID: %-10s | Tel: %d | Bicis: %d", 
                             nombre, identificacion, telefono, listaBicicletas.size());
    }
}
