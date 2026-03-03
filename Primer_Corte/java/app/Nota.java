package app;

public class Nota {
    private String codigo;
    private double valor;

    public Nota(String codigo, double valor) {
        this.codigo = codigo;
        this.valor = valor;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    @Override
    public String toString() {
        return "Nota{" +
                "codigo='" + codigo + '\'' +
                ", valor=" + valor +
                '}';
    }
}
