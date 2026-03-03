

/**
 * Clase que representa al personal técnico del taller.
 * Atributos según diagrama: nombre, identificación, disponibilidad y código.
 */
public class Mecanico {
    private String nombre;
    private String identificacion;
    private boolean disponibilidad; // true = Disponible, false = Ocupado
    private String codigoEmpleado;

    /**
     * Constructor para inicializar un mecánico.
     * Al ser contratado/registrado, entra por defecto como 'Disponible'.
     */
    public Mecanico(String nombre, String identificacion, String codigoEmpleado) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.codigoEmpleado = codigoEmpleado;
        this.disponibilidad = true; 
    }

    // --- MÉTODOS DE ACCESO (GETTERS Y SETTERS) ---

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public String getCodigoEmpleado() {
        return codigoEmpleado;
    }

    public void setCodigoEmpleado(String codigoEmpleado) {
        this.codigoEmpleado = codigoEmpleado;
    }

    // --- REPRESENTACIÓN VISUAL ---

    @Override
    public String toString() {
        // Transformamos el boolean en un String amigable para el reporte
        String estado = (disponibilidad) ? "DISPONIBLE" : "EN LABOR";
        
        return String.format("Mecánico: %-15s | ID: %-10s | Cód: %-5s | Estado: %s", 
                             nombre, identificacion, codigoEmpleado, estado);
    }
}
