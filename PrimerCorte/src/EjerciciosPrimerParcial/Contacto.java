package EjerciciosPrimerParcial;

public class Contacto {
    private String nombre;
    private String telefono;
    private String email;

    public Contacto (String nombre, String telefono, String email){
        this.telefono = telefono;
        this.nombre = nombre;
        this.email = email;

    }
    
    public String getTelefono(){
        return this.telefono;
    }


    public boolean esTelefonoCapicua(){
        boolean flag = true;
        String telefono = this.telefono;
        for (int i=0; i<telefono.length();i++){
            if(telefono.charAt(i)!=telefono.charAt(telefono.length()-i-1)){                
                flag = false;
                break;
            }
            
        }
        return flag;
    }

    public int calcularSumaDigitosContacto (){
        int acum = 0;
        for (int i=0;i<this.telefono.length();i++){
            acum += Character.getNumericValue(this.telefono.charAt(i));
        }
        return acum;
    }
    
    public boolean verificarNombrePalindromo(){
        boolean flag = true;
        String nombre = this.nombre.toLowerCase();
        for (int i=0 ; i<nombre.length()/2 ; i++){
            if (nombre.charAt(i)!=nombre.charAt(nombre.length()-i-1)){
                flag = false;
                break;
            }
        }

        return flag;
    }

    public boolean verificarNombreInicial(String nombreBuscado){
        return this.nombre.startsWith(nombreBuscado);
    }
    
    @Override

    public String toString(){
        return "Contacto: " + nombre + " | Teléfono: " + telefono;
    }
}
