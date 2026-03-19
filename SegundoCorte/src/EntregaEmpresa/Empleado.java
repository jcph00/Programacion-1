package EntregaEmpresa;

import java.time.LocalTime;

public class Empleado {
    private String nombre;
    private String cedula;
    private LocalTime horaEntrada;
    private LocalTime horaSalida;

    public Empleado(String nombre, String cedula, LocalTime horaEntrada, LocalTime horaSalida) {
        this.nombre = nombre;
        this.cedula = cedula;
        this.horaEntrada = horaEntrada;
        this.horaSalida = horaSalida;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCedula() {
        return cedula;
    }

    public LocalTime getHoraEntrada() {
        return horaEntrada;
    }

    public LocalTime getHoraSalida() {
        return horaSalida;
    }

    public boolean llegoTarde(LocalTime horaEntradaEmpresa){
        return this.horaEntrada.isAfter(horaEntradaEmpresa);
    }

    @Override
    public String toString() {
        return "Empleado: " + this.nombre + ", Cedula: " + this.cedula + ", Hora Entrada: " + this.horaEntrada + ", Hora Salida: " + this.horaSalida;
    }

}
