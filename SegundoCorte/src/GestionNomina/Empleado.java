package GestionNomina;

public abstract class Empleado {
    private String nombre;
    private String doucumento;
    private int edad;
    private float salarioBase;
    private CategoriaEmpleado categoria;
    private float descuentoSalud;
    private float descuentoPension;

    public Empleado(String nombre, String doucumento, int edad, float salarioBase, CategoriaEmpleado categoria) {
        this.nombre = nombre;
        this.doucumento = doucumento;
        this.edad = edad;
        this.salarioBase = salarioBase;
        this.categoria = categoria;
        this.descuentoSalud = calcularDescuentoSalud();
        this.descuentoPension = calcularDescuentoPension();
    }
    

    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public String getDoucumento() {
        return doucumento;
    }


    public void setDoucumento(String doucumento) {
        this.doucumento = doucumento;
    }


    public int getEdad() {
        return edad;
    }


    public void setEdad(int edad) {
        this.edad = edad;
    }


    public float getSalarioBase() {
        return salarioBase;
    }


    public void setSalarioBase(float salarioBase) {
        this.salarioBase = salarioBase;
    }


    public CategoriaEmpleado getCategoria() {
        return categoria;
    }


    public void setCategoria(CategoriaEmpleado categoria) {
        this.categoria = categoria;
    }


    public float getDescuentoSalud() {
        return descuentoSalud;
    }


    public void setDescuentoSalud(float descuentoSalud) {
        if (descuentoSalud < 0 || descuentoSalud > 100) {
            throw new IllegalArgumentException("El descuento de salud debe estar entre 0 y 100.");
        }
        this.descuentoSalud = descuentoSalud;
    }


    public float getDescuentoPension() {
        return descuentoPension;
    }


    public void setDescuentoPension(float descuentoPension) {
        if (descuentoPension < 0 || descuentoPension > 100) {
            throw new IllegalArgumentException("El descuento de pensión debe estar entre 0 y 100.");
        }
        this.descuentoPension = descuentoPension;
    }


    private float calcularDescuentoSalud() {
        return salarioBase;
    }

    private float calcularDescuentoPension() {
        return salarioBase;
    }

    private float calcularBonificacionCategoria() {
        return salarioBase * (categoria.getValorAdicional()); // Bonificación según la categoría del empleado
    }

    private float calcularSalarioNeto() {
        return calcularSalarioBruto() - descuentoSalud - descuentoPension;
    }
    
    protected float calcularSalarioBruto() {
        return salarioBase + calcularBonificacionCategoria(); // Salario base más bonificación de categoría
    }

    private void mostrarInformacion() {
        System.out.println(String.format("Nombre: %s\nDocumento: %s\nEdad: %d\nSalario Base: %.2f\nCategoría: %s\nDescuento Salud: %.2f\nDescuento Pensión: %.2f\nSalario Neto: %.2f",
                nombre, doucumento, edad, salarioBase, categoria.name(), descuentoSalud, descuentoPension, calcularSalarioNeto()));
    }


    @Override
    public String toString() {
        return "Empleado [nombre=" + nombre + ", doucumento=" + doucumento + ", edad=" + edad + ", salarioBase="
                + salarioBase + ", categoria=" + categoria + ", descuentoSalud=" + descuentoSalud
                + ", descuentoPension=" + descuentoPension + "]";
    }

    
}
