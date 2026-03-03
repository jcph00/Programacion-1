

import java.util.ArrayList;

/**
 * Clase núcleo del sistema.
 * Gestiona la relación entre el mecánico, la bicicleta y los costos.
 */
public class Orden {
    private String id;
    private String fechaIngreso;
    private String estado; // "Recibida", "En Taller", "Lista para entrega", "Entregada"
    private String descripcionProblema;
    private double costoManoObra;
    private double costoTotal;

    // Relaciones (Atributos de objeto y listas)
    private Bicicleta bicicleta;
    private Mecanico mecanico;
    private ArrayList<Repuesto> listaRepuestos;
    private ArrayList<Tarea> listaTareas;

    /**
     * Constructor de la Orden.
     * Inicializa las listas y el estado inicial.
     */
    public Orden(String id, String fechaIngreso, String descripcionProblema, Bicicleta bicicleta) {
        this.id = id;
        this.fechaIngreso = fechaIngreso;
        this.descripcionProblema = descripcionProblema;
        this.bicicleta = bicicleta;
        this.estado = "Recibida";
        this.costoManoObra = 0.0;
        this.costoTotal = 0.0;
        this.listaRepuestos = new ArrayList<>();
        this.listaTareas = new ArrayList<>();
    }

    // --- MÉTODOS LÓGICOS DEL DIAGRAMA ---

    public void asignarResponsable(Mecanico mecanico) {
        this.mecanico = mecanico;
        this.mecanico.setDisponibilidad(false); // Al asignarle una orden, ya no está disponible
    }

    public void cambiarResponsable(Mecanico nuevoMecanico) {
        if (this.mecanico != null) {
            this.mecanico.setDisponibilidad(true); // El anterior queda libre
        }
        this.mecanico = nuevoMecanico;
        this.mecanico.setDisponibilidad(false); // El nuevo queda ocupado
    }

    public void adicionarTarea(String nombre, String descripcion) {
        Tarea nuevaTarea = new Tarea(nombre, descripcion);
        this.listaTareas.add(nuevaTarea);
    }

    public void adicionarRepuesto(String nombre, int cant, double precio) {
        Repuesto nuevoRepuesto = new Repuesto(nombre, cant, precio);
        this.listaRepuestos.add(nuevoRepuesto);
    }

    public double calcularLiquidacion() {
        double sumaRepuestos = 0;
        for (Repuesto r : listaRepuestos) {
            sumaRepuestos += r.calcularSubtotal();
        }
        this.costoTotal = sumaRepuestos + this.costoManoObra;
        return this.costoTotal;
    }

    // --- GETTERS Y SETTERS ---

    public void setCostoManoObra(double costoManoObra) { this.costoManoObra = costoManoObra; }
    public String getEstado() { return estado; }
    public void setEstado(String estado) { this.estado = estado; }
    public Bicicleta getBicicleta() { return bicicleta; }

    // --- REPRESENTACIÓN VISUAL ---

    @Override
public String toString() {
    return String.format("ORDEN ID: %s | Fecha: %s | Estado: [%s]\n" +
                         "Problema: %s\n" +
                         "Bici: %s | Total: $%.2f", 
                         id, fechaIngreso, estado.toUpperCase(), 
                         descripcionProblema, bicicleta.getSerial(), calcularLiquidacion());
}
}
