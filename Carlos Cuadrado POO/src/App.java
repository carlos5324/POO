import com.coti.tools.Esdia;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("|----------------------------------------------|\r\n" + 
                        "| MIS LIBROS |\r\n" + //
                        "|----------------------------------------------|\r\n" + 
                        "1) Nuevo almacén de libros\r\n" + //
                        "2) Establecer ritmo de lectura (páginas por minuto)\r\n" + 
                        "3) Añadir un nuevo libro al almacén\r\n" + 
                        "4) Mostrar información actual de libros\r\n" + 
                        "5) Salir (se borrará toda la información)\r\n" + 
                        "|----------------------------------------------|\r\n" );


    

         

        int flag=0;
        int  RitmoLectura=1;
        int flag1=0;

        Almacen almacen = null;
        
        while(flag==0){

        int Opcion = Esdia.readInt("Seleccione una opción (1-4):");    

        if(Opcion==1){
            int Capacidad =Esdia.readInt("Capacidad del nuevo almacén de libros...");
            almacen = new Almacen(Capacidad);

            flag1=1;
            
        }
        else if (Opcion==2){
            if(flag1!=1){
                System.out.println("Es necesario crear primero un almacen");
            }
            else{
            RitmoLectura =Esdia.readInt("Tiempo de lectura medio...");
            almacen.AñadirTiempoLectura(RitmoLectura);
            }
        }
        else if (Opcion==3){
            if(flag1!=1){
                System.out.println("es necesario crear primero un almacen");
            }
            else{
                almacen.AñadirLibro();
            }
              
        }
        else if (Opcion==4){
            if(flag1!=1){
                System.out.println("es necesario crear primero un almacen");
            }
            else{
                almacen.mostrarLibros();
            }
            
        }
        else if (Opcion==5){
            System.out.println("Saliendo...");
            flag=1;
        }
        else{
            System.out.println("Opcion incorrecta,vuelva a intentarlo");
        }

        }
    }

    
}
