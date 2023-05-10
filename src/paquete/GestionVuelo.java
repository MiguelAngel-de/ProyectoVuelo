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
    int horaSalida;
    public void agregarVuelo(){
        System.out.println("ingrese la ID del vuelo: ");
         nVuelo=leer.nextInt();
        leer.nextLine();
        System.out.println("ingrese el origen del  vuelo: ");
         origenVuelo=leer.nextLine();
        System.out.println("ingrese el destino del vuelo: ");
         destinoVuelo=leer.nextLine();
        System.out.println("ingrese la hora estimada de salida: ");
        horaSalida=leer.nextInt();
      LocalDateTime dateTime = 
          LocalDateTime.ofEpochSecond(horaSalida, 0, ZoneOffset.UTC);
        colaVuelo.offer(new Vuelo(nVuelo, origenVuelo, destinoVuelo, dateTime ));
        colaRespaldo.offer(new Vuelo(nVuelo, origenVuelo, destinoVuelo, dateTime ));
    }
    public void modificarVuelo(){
        System.out.println("introduzca la hora que desea modificar: ");
        int horaModificar=leer.nextInt();
        LocalDateTime dateTimeModifit = 
        LocalDateTime.ofEpochSecond(horaModificar, 0, ZoneOffset.UTC);
        colaRespaldo.offer(new Vuelo(nVuelo, origenVuelo, destinoVuelo, dateTimeModifit ));
    }
    


}
