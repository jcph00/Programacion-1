package app;

import java.util.ArrayList;

public class Estudiante {
    private String nombre;
    private String identificacion;
    private double promedio;

    private ArrayList<Nota> listaNotas;

    public Estudiante(String nombre, String identificacion, double promedio) {
        this.nombre = nombre;
        this.identificacion = identificacion;
        this.promedio = promedio;
        this.listaNotas = new ArrayList<>();
    }

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

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void calcularPromedio(ArrayList<Nota> listaNotas) {
        double suma = 0;
        for (Nota nota : listaNotas) {
            suma += nota.getValor();
        }
        this.promedio = suma / listaNotas.size();
    }

    public void agregarNota(Nota nota) {
        this.listaNotas.add(nota);
    }

    public ArrayList<Nota> getListaNotas() {
        return listaNotas;
    }

    public void calcularPromedio() {
        if (listaNotas.isEmpty()) {
            this.promedio = 0;
            return;
        }
        double suma = 0;
        for (Nota nota : listaNotas) {
            suma += nota.getValor();
        }
        this.promedio = suma / listaNotas.size();
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", identificacion='" + identificacion + '\'' +
                ", promedio=" + promedio +
                '}';
    }
}
