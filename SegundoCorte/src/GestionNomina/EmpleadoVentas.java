package GestionNomina;

public class EmpleadoVentas extends Empleado {
    private float totalVentas;
    private float porcentajeComision;

    public EmpleadoVentas(String nombre, String doucumento, int edad, float salarioBase, CategoriaEmpleado categoria, float totalVentas, float porcentajeComision) {
        super(nombre, doucumento, edad, salarioBase, categoria);
        this.totalVentas = totalVentas;
        this.porcentajeComision = porcentajeComision;
    }
    
    public float getTotalVentas() {
        return totalVentas;
    }

    public void setTotalVentas(float totalVentas) {
        this.totalVentas = totalVentas;
    }

    public float getPorcentajeComision() {
        return porcentajeComision;
    }

    public void setPorcentajeComision(float porcentajeComision) {
        if (porcentajeComision < 0 || porcentajeComision > 100) {
            throw new IllegalArgumentException("El porcentaje de comisión debe estar entre 0 y 100.");
        }
        this.porcentajeComision = porcentajeComision;
    }

    public float calcularSalarioBruto() {
        return super.calcularSalarioBruto() + (totalVentas * porcentajeComision/100); // Salario base más bonificación de categoría y comisión por ventas
    }

    @Override
    public String toString() {
        return "EmpleadoVentas [totalVentas=" + totalVentas + ", porcentajeComision=" + porcentajeComision + "]";
    }
    
}
