package Zoologico;

import java.util.ArrayList;
import java.util.List;

public class Zoologico {
    private String nombre;
    private List<Animal> listaAnimales = new ArrayList<>();

    public Zoologico(String nombre) {
        this.nombre = nombre;
    }

    // Getters and setters
    public String getNombre() {
        return nombre;
    }

    public List<Animal> getListaAnimales() {
        return listaAnimales;
    }

    public String registrarAnimal(Animal animal) {
        String resultado = "";
        boolean animalEncontrado = buscarAnimal(animal.getCodigo());
        if(animalEncontrado){
            resultado = "El animal con código " + animal.getCodigo() + " ya está registrado.";
        } else {
            listaAnimales.add(animal);
            resultado = "Animal registrado exitosamente.";
        }
        return resultado;
        
    }
    // La programación imperativa utilizando un bucle for para buscar un animal por su código.
    // Se ve el como
    public boolean buscarAnimalImperativo(String codigo) {
        for (Animal animal : listaAnimales) {
            if (animal.getCodigo().equals(codigo)) {
                return true;
            }
        }
        return false;
    }
    // Programación declarativa utilizando streams para buscar un animal por su código.
    // Se ve el qué
    // Método para buscar un animal por su código, forma más eficiente utilizando streams.
    public boolean buscarAnimal(String codigo) {
        return listaAnimales.stream().anyMatch(animal -> animal.getCodigo().equals(codigo));
    }
}
