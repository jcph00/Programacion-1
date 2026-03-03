package app;

import java.util.ArrayList;

public class Curso {
    private String codigo;
    private String nombre;
    private double promedio;
    private byte numeroEvaluaciones;
    private Profesor profesor;

    private ArrayList<Estudiante> listaEstudiantes;
    private ArrayList<Nota> listaNotas;

    public Curso(String codigo, String nombre, double promedio, byte numeroEvaluaciones) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.promedio = promedio;
        this.numeroEvaluaciones = numeroEvaluaciones;
        this.listaEstudiantes = new ArrayList<>();
        this.listaNotas = new ArrayList<>();
        this.profesor = null;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public byte getNumeroEvaluaciones() {
        return numeroEvaluaciones;
    }

    public void setNumeroEvaluaciones(byte numeroEvaluaciones) {
        this.numeroEvaluaciones = numeroEvaluaciones;
    }

    public void calcularPromedioGeneral(double [] calificaciones) {
        double suma = 0;
        for (double calificacion : calificaciones) {
            suma += calificacion;
        }
        this.promedio = suma / calificaciones.length;
    }

    public void asignarProfesor(Profesor profesor) {
        this.profesor = profesor;
    }

    public Profesor getProfesor() {
        return profesor;
    }

    public void agregarEstudiante(Estudiante estudiante) {
        this.listaEstudiantes.add(estudiante);
    }

    public void agregarNota(Nota nota) {
        this.listaNotas.add(nota);
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    public ArrayList<Nota> getListaNotas() {
        return listaNotas;
    }



    @Override
    public String toString() {
        return "Curso{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", promedio=" + promedio +
                ", numeroEvaluaciones=" + numeroEvaluaciones +
                '}';
    }

}
