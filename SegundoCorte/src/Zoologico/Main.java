package Zoologico;

import javax.swing.JOptionPane;

public class Main {
    public static void main(String[] args) {
        Zoologico zoologico = new Zoologico("Zoológico de Bogotá");
        Animal animal1 = new Gato("Simba", "001", "Felinus felis", "Negro",
         "Macho", (byte) 3, 7, 6);
        Gato animal2 = new Gato("Mia", "002", "Felinus felis", "Blanco",
         "Hembra", (byte) 2, 5, 4);

        zoologico.registrarAnimal(animal1);
        zoologico.registrarAnimal(animal2);

        // animal1.irArenero(); Esto no es posible porque el método irArenero() no está definido en la clase Animal, sino en la clase Gato. Para solucionar esto, se puede hacer un casting de animal1 a Gato, ya que sabemos que es un gato.
        ((Gato) animal1).irArenero(); // Esto es posible porque estamos haciendo un casting de animal1 a Gato, lo que nos permite acceder al método irArenero() definido en la clase Gato.
        animal2.irArenero();

    }
}