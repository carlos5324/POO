import com.coti.tools.Esdia;

public class Almacen {
    
    public Libros almacen[];
    int Añadidos;
    int RitmoLectura;

    public Almacen(int Capacidad){
        this.almacen=new Libros[Capacidad];
        this.Añadidos=0;
        this.RitmoLectura=1;
    }

    public void AñadirTiempoLectura(int ritmo) {
        this.RitmoLectura = ritmo;
    }

    public Libros[] getAlmacen() {
        return almacen;
    }
    public void setAlmacen(Libros[] Almacen) {
        almacen = Almacen;
    }

    public  void AñadirLibro(){

        if(Añadidos>=almacen.length){
            System.out.println("No se pueden añadir mas libros");
            return;
        }

        String titulo = Esdia.readString("Título del libro:");
        String nombreAutor = Esdia.readString("Nombre del autor:");
        String apellidosAutor = Esdia.readString("Apellidos del autor:");
        int premioPlaneta = Esdia.readInt("¿El autor ha ganado el premio Planeta? (1=Si y 0=No)");
        int Paginas = Esdia.readInt("Número de páginas:");
        int precio = Esdia.readInt("Precio del libro:");
        int TLM = Esdia.readInt("Tiempo de lectura medio?");

        Modelos autor = new Modelos(nombreAutor, apellidosAutor, premioPlaneta);
        Libros libro = new Libros(titulo,Paginas,TLM,autor,precio);
        almacen[Añadidos] = libro;
        Añadidos++;
    }

    public void mostrarLibros(){
        System.out.println("| Título | Autor | Premio Planeta | Páginas | Precio |");
        for (int i = 0; i < Añadidos; i++) {
            if (almacen[i]!=null) {
                System.out.printf("%s   %s  %d         %d   %d\n",almacen[i].Titulo,almacen[i].autor.nombre,almacen[i].autor.PP,almacen[i].Pag,almacen[i].Precio);
            }
    }
    }
}


