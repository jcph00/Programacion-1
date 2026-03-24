package Zoologico;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico("Zoológico de Bogotá");
        Animal animal1 = new Gato("Simba", "001", "Panthera leo", "Amarillo",
         "Macho", (byte) 10, 9, 24);
         
        String resultado = zoologico.registrarAnimal(animal1);
        JOptionPane.showMessageDialog(null, resultado);
    }
}