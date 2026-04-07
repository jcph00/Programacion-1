package GestionNomina;

public class EmpleadoTemporal extends Empleado {
    private int diasTrabajados;
    private float valorDia;

    public EmpleadoTemporal(String nombre, String doucumento, int edad, float salarioBase, CategoriaEmpleado categoria, int diasTrabajados, float valorDia) {
        super(nombre, doucumento, edad, salarioBase, categoria);
        this.diasTrabajados = diasTrabajados;
        this.valorDia = valorDia;
    }
    
    public int getDiasTrabajados() {
        return diasTrabajados;
    }

    public void setDiasTrabajados(int diasTrabajados) {
        if (diasTrabajados < 0) {
            throw new IllegalArgumentException("Los días trabajados no pueden ser negativos.");
        }
        this.diasTrabajados = diasTrabajados;
    }

    public float getValorDia() {
        return valorDia;
    }

    public void setValorDia(float valorDia) {
        if (valorDia < 0) {
            throw new IllegalArgumentException("El valor del día no puede ser negativo.");
        }
        this.valorDia = valorDia;
    }

    public float calcularSalarioBruto() {
        return super.calcularSalarioBruto() + (diasTrabajados * valorDia); // Salario base más bonificación de categoría y pago por días trabajados
    }

    @Override
    public String toString() {
        return "EmpleadoTemporal [diasTrabajados=" + diasTrabajados + ", valorDia=" + valorDia + "]";
    }
        
}
