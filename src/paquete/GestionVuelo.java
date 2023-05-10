package paquete;
import java.util.*;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
public class GestionVuelo {
    PriorityQueue<Vuelo> colaVuelo = new PriorityQueue<>();
   PriorityQueue<Vuelo> colaRespaldo = new PriorityQueue<>();
   Vuelo vuelo;
    Scanner leer=new Scanner(System.in);
    int nVuelo;
    String origenVuelo;
    String destinoVuelo;
    String horaSalida;
    public void agregarVuelo(){
        System.out.println("ingrese la ID del vuelo: ");
         nVuelo=leer.nextInt();
        leer.nextLine();
        System.out.println("ingrese el origen del  vuelo: ");
         origenVuelo=leer.nextLine();
        System.out.println("ingrese el destino del vuelo: ");
         destinoVuelo=leer.nextLine();
        System.out.println("ingrese la hora estimada de salida: ");
        horaSalida=leer.nextLine();
        leer.nextLine();
      LocalDateTime dateTime = 
          LocalDateTime.parse(horaSalida);
        colaVuelo.offer(new Vuelo(nVuelo, origenVuelo, destinoVuelo, dateTime ));
        colaRespaldo.offer(new Vuelo(nVuelo, origenVuelo, destinoVuelo, dateTime ));
    }
    public void modificarVuelo(){
        System.out.println("introduzca la hora que desea modificar: ");
        String horaModificar=leer.nextLine();
        LocalDateTime dateTimeModifit = LocalDateTime.parse(horaModificar);
        
        colaRespaldo.offer(new Vuelo(nVuelo, origenVuelo, destinoVuelo, dateTimeModifit ));
    }



}
