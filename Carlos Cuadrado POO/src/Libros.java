public class Libros {
    String Titulo;
    int Pag,TLM,Precio;
    Modelos autor;
    public Libros(String Titulo,int Pag,int TLM,Modelos autor,int Precio){
        
        this.Pag=Pag;
        this.Precio=Precio;
        this.TLM=TLM;
        this.Titulo=Titulo;
        this.autor=autor;
    }

    
    public int getPag() {
        return Pag;
    }
    public int getPrecio() {
        return Precio;
    }
    public int getTLM() {
        return TLM;
    }
    public String getTitulo() {
        return Titulo;
    }
    public Modelos getAutor() {
        return autor;
    }

    
    public void setPag(int pag) {
        Pag = pag;
    }
    public void setPrecio(int precio) {
        Precio = precio;
    }
    public void setTLM(int tLM) {
        TLM = tLM;
    }
    public void setTitulo(String titulo) {
        Titulo = titulo;
    }
    public void setAutor(Modelos autor) {
        this.autor = autor;
    }
    
}
