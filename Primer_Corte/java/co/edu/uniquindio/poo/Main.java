package co.edu.uniquindio.poo;

import app.*;

public class Main {
    public static void main(String[] args) {
        // 1. Crear el programa académico
        ProgramaAcademico programa = new ProgramaAcademico("PA001", "Ingeniería en Sistemas");
        System.out.println("✓ Programa creado: " + programa.getNombre());
        System.out.println();

        // 2. Crear y agregar profesores
        Profesor profesor1 = new Profesor("P001", "Dr. Juan García");
        Profesor profesor2 = new Profesor("P002", "Dra. María López");
        programa.agregarProfesor(profesor1);
        programa.agregarProfesor(profesor2);
        System.out.println("✓ Profesores agregados al programa:");
        for (Profesor p : programa.getListaProfesores()) {
            System.out.println("  - " + p.getNombre() + " (" + p.getCodigo() + ")");
        }
        System.out.println();

        // 3. Crear un curso y asignarlo a un profesor
        Curso cursoPOO = new Curso("C001", "Programación Orientada a Objetos", 0, (byte) 3);
        cursoPOO.asignarProfesor(profesor1);  // El profesor1 imparte este curso
        programa.agregarCurso(cursoPOO);
        System.out.println("✓ Curso creado: " + cursoPOO.getNombre());
        System.out.println("  Profesor asignado: " + cursoPOO.getProfesor().getNombre());
        System.out.println();

        // 4. Crear estudiantes y agregarlos al curso
        Estudiante est1 = new Estudiante("Carlos Pérez", "1001", 0);
        Estudiante est2 = new Estudiante("Laura Rodríguez", "1002", 0);
        Estudiante est3 = new Estudiante("Pedro Martínez", "1003", 0);

        cursoPOO.agregarEstudiante(est1);
        cursoPOO.agregarEstudiante(est2);
        cursoPOO.agregarEstudiante(est3);

        programa.agregarEstudiante(est1);
        programa.agregarEstudiante(est2);
        programa.agregarEstudiante(est3);

        System.out.println("✓ Estudiantes agregados al curso '" + cursoPOO.getNombre() + "':");
        for (Estudiante e : cursoPOO.getListaEstudiantes()) {
            System.out.println("  - " + e.getNombre() + " (" + e.getIdentificacion() + ")");
        }
        System.out.println();

        // 5. Agregar notas a los estudiantes
        System.out.println("✓ Agregando notas a los estudiantes:");

        // Notas para Carlos
        est1.agregarNota(new Nota("Parcial 1", 4.2));
        est1.agregarNota(new Nota("Parcial 2", 3.8));
        est1.agregarNota(new Nota("Final", 4.5));
        est1.calcularPromedio();
        System.out.println("  " + est1.getNombre() + " - Promedio: " + est1.getPromedio());

        // Notas para Laura
        est2.agregarNota(new Nota("Parcial 1", 5.0));
        est2.agregarNota(new Nota("Parcial 2", 4.8));
        est2.agregarNota(new Nota("Final", 4.9));
        est2.calcularPromedio();
        System.out.println("  " + est2.getNombre() + " - Promedio: " + est2.getPromedio());

        // Notas para Pedro
        est3.agregarNota(new Nota("Parcial 1", 3.5));
        est3.agregarNota(new Nota("Parcial 2", 3.2));
        est3.agregarNota(new Nota("Final", 3.8));
        est3.calcularPromedio();
        System.out.println("  " + est3.getNombre() + " - Promedio: " + est3.getPromedio());
        System.out.println();

        // 6. Mostrar resumen completo
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║     RESUMEN DEL PROGRAMA ACADÉMICO     ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println(programa);
        System.out.println();

        // 7. Ver detalles de un curso
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║     DETALLES DEL CURSO - POO           ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("Curso: " + cursoPOO.getNombre());
        System.out.println("Profesor: " + cursoPOO.getProfesor().getNombre());
        System.out.println("Número de evaluaciones: " + cursoPOO.getNumeroEvaluaciones());
        System.out.println("Estudiantes en el curso: " + cursoPOO.getListaEstudiantes().size());
        System.out.println();

        // 8. Ver las notas de un estudiante
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("║     NOTAS DEL ESTUDIANTE               ║");
        System.out.println("╚════════════════════════════════════════╝");
        System.out.println("Estudiante: " + est1.getNombre());
        System.out.println("Notas:");
        for (Nota nota : est1.getListaNotas()) {
            System.out.println("  - " + nota.getCodigo() + ": " + nota.getValor());
        }
        System.out.println("Promedio: " + est1.getPromedio());
    }
}

