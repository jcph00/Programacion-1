package Testing;

public class Main {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora(5, 10);
        int resultadoSuma = calculadora.sumar();

        if (resultadoSuma == 15) {
            System.out.println("La suma es correcta.");
        } else {
            System.out.println("La suma es incorrecta.");
        }
        System.out.println("El resultado de la suma es: " + resultadoSuma);
    }
}
