public class Modelos {
    
    String nombre,apellidos;
    int PP;

    public Modelos(String nombre, String apellidos, int PP){
        this.PP=PP;
        this.nombre=nombre;
        this.apellidos=apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setPP(int pP) {
        PP = pP;
    }
    
    public String getApellidos() {
        return apellidos;
    }
    public String getNombre() {
        return nombre;
    }
    public int getPP() {
        return PP;
    }

    
}
