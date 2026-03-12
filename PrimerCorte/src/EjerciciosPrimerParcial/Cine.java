package EjerciciosPrimerParcial;

import java.util.ArrayList;
import java.util.List;

public class Cine {

    private List<Combo> catalogoCombos;
    private String nombre;

    public Cine (String nombre){
        this.catalogoCombos = new ArrayList<>();
        this.nombre = nombre;
    }
    


    public double obtenerPrecioDeCombo(String nombreBuscado){
        for ( Combo p : catalogoCombos){
            if (p.getNombre().equals(nombreBuscado)){
                return p.getPrecio();
            }
        }
        return -1.0;
    }    
}
