package app;

import java.util.ArrayList;

public class ProgramaAcademico {
    private String codigo;
    private String nombre;

    private ArrayList<Profesor> listaProfesores;
    private ArrayList<Curso> listaCursos;
    private ArrayList<Estudiante> listaEstudiantes;

    public ProgramaAcademico(String codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.listaProfesores = new ArrayList<>();
        this.listaCursos = new ArrayList<>();
        this.listaEstudiantes = new ArrayList<>();
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

    public void agregarProfesor(Profesor profesor) {
        listaProfesores.add(profesor);
    }

    public void agregarCurso(Curso curso) {
        this.listaCursos.add(curso);
    }

    public void agregarEstudiante(Estudiante estudiante) {
        listaEstudiantes.add(estudiante);
    }

    public ArrayList<Profesor> getListaProfesores() {
        return listaProfesores;
    }

    public ArrayList<Curso> getListaCursos() {
        return listaCursos;
    }

    public ArrayList<Estudiante> getListaEstudiantes() {
        return listaEstudiantes;
    }

    @Override
    public String toString() {
        return "ProgramaAcademico{" +
                "codigo='" + codigo + '\'' +
                ", nombre='" + nombre + '\'' +
                ", listaProfesores=" + listaProfesores +
                ", listaCursos=" + listaCursos +
                ", listaEstudiantes=" + listaEstudiantes +
                '}';
    }
}

