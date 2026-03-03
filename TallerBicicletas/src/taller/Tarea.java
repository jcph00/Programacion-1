

/**
 * Clase que representa una labor técnica realizada en la bicicleta.
 * Se ha actualizado el atributo estado de boolean a String para mayor flexibilidad.
 */
public class Tarea {
    private String nombre;
    private String descripcion;
    private String estado; // Ejemplo: "Pendiente", "En proceso", "Finalizada"

    /**
     * Constructor para inicializar una tarea.
     * Al crearse, el estado inicial siempre será "Pendiente".
     */
    public Tarea(String nombre, String descripcion) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.estado = "Pendiente"; 
    }

    // --- MÉTODOS DE ACCESO (GETTERS Y SETTERS) ---

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public String getEstado() {
        return estado;
    }

    /**
     * Permite cambiar el estado de la tarea (ej. de "Pendiente" a "Finalizada").
     * @param estado El nuevo estado de la labor técnica.
     */
    public void setEstado(String estado) {
        this.estado = estado;
    }

    // --- REPRESENTACIÓN VISUAL ---

    @Override
    public String toString() {
        // Usamos String.format para que el reporte de la orden salga alineado
        return String.format("[%s] | Tarea: %-15s | Detalle: %s", 
                             estado.toUpperCase(), nombre, descripcion);
    }
}
