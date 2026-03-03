/**
 * Clase que representa el vehículo a reparar.
 * Según el diagrama: serial, marca, modelo, tipo y la relación con el dueño.
 */
public class Bicicleta {
    private String serial;
    private String marca;
    private String modelo;
    private String tipo; // Ejemplo: "BMX", "Ruta", "Montaña"
    private Cliente dueño; // Asociación con la clase Cliente

    /**
     * Constructor para inicializar la bicicleta.
     * El dueño se vincula después mediante el método específico.
     */
    public Bicicleta(String serial, String marca, String modelo, String tipo) {
        this.serial = serial;
        this.marca = marca;
        this.modelo = modelo;
        this.tipo = tipo;
    }

    // --- MÉTODO CLAVE DEL DIAGRAMA ---

    /**
     * Establece quién es el propietario de esta bicicleta.
     * @param dueño Objeto de la clase Cliente.
     */
    public void vincularDueño(Cliente dueño) {
        this.dueño = dueño;
    }

    // --- GETTERS Y SETTERS ---

    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Cliente getDueño() {
        return dueño;
    }

    // --- REPRESENTACIÓN VISUAL ---

    @Override
    public String toString() {
        // Validación simple por si la bicicleta aún no tiene dueño asignado
        String nombreDueño = (dueño != null) ? dueño.getNombre() : "Pendiente de registro";
        
        return String.format("Bicicleta Serial: %-10s | %s %s | Tipo: %-10s | Dueño: %s", 
                             serial, marca, modelo, tipo, nombreDueño);
    }
}
