package GestionNomina;

public class Main {
    public static void main(String[] args) {
        Empresa empresa = new Empresa();
        EmpleadoPlanta empleado1 = new EmpleadoPlanta("Juan Perez", "123456789", 30, 2000f , "Gerente", CategoriaEmpleado.SENIOR, 10, 50f, 100f); 
        EmpleadoVentas empleado2 = new EmpleadoVentas("Maria Gomez", "987654321", 25, 1500f, CategoriaEmpleado.JUNIOR, 50000f, 10f);
        empresa.agregarEmpleado(empleado1);
        empresa.agregarEmpleado(empleado2);
    }
}
