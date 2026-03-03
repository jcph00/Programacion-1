

/**
 * Clase que representa un repuesto utilizado en una orden de servicio.
 * Basado en el diagrama de clases del proyecto.
 */
public class Repuesto {
    // Atributos privados según el diagrama
    private String nombre;
    private int cantidad;
    private double costoUnitario;
    private double subtotalRepuesto;

    /**
     * Constructor para inicializar un repuesto.
     * Al crearse, calcula automáticamente el subtotal.
     */
    public Repuesto(String nombre, int cantidad, double costoUnitario) {
        this.nombre = nombre;
        this.cantidad = cantidad;
        this.costoUnitario = costoUnitario;
        this.calcularSubtotal();
    }

    // --- MÉTODOS LÓGICOS ---

    /**
     * Calcula el subtotal multiplicando cantidad por costo unitario.
     * @return El valor calculado del subtotal.
     */
    public double calcularSubtotal() {
        this.subtotalRepuesto = this.cantidad * this.costoUnitario;
        return this.subtotalRepuesto;
    }

    // --- GETTERS Y SETTERS ---

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidad() {
        return cantidad;
    }

    /**
     * Actualiza la cantidad y recalcula el subtotal automáticamente.
     */
    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
        this.calcularSubtotal();
    }

    public double getCostoUnitario() {
        return costoUnitario;
    }

    /**
     * Actualiza el costo unitario y recalcula el subtotal automáticamente.
     */
    public void setCostoUnitario(double costoUnitario) {
        this.costoUnitario = costoUnitario;
        this.calcularSubtotal();
    }

    public double getSubtotalRepuesto() {
        return subtotalRepuesto;
    }

    // --- REPRESENTACIÓN VISUAL ---

    @Override
    public String toString() {
        return String.format("Repuesto: %-15s | Cant: %-3d | Precio Un: $%-8.2f | Subtotal: $%-8.2f", 
                             nombre, cantidad, costoUnitario, subtotalRepuesto);
    }
}
