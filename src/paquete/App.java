package paquete;
import java.util.Scanner;
public class App {

    public static void main(String[] args) throws Exception {
        Scanner leer = new Scanner(System.in);
        int op;
        GestionVuelo vuelo=new GestionVuelo();
       
        do{
           System.out.println("1 para agregar vuelo. \n2 para modificar vuelo. \n3 para eliminar vuelo. \n4 para mostrar vuelo de salida. \n0 para salir de la aplicacion.");
           op=leer.nextInt();
            switch(op){
                case 1:
                vuelo.agregarVuelo();
                break;
                case 2:
                vuelo.modificarVuelo();
                break;
                case 3:
                vuelo.eliminarVuelo();
                break;
                case 4:
                vuelo.mostrarVulos();
                break;
                default:
                System.out.println("numero incorrecto, introduzca el numero correspondiente por favor");

            }

        }while(op!=0);
    }
}
