package paquete;
import java.util.*;
import java.time.LocalDateTime;
import java.time.ZoneOffset;
public class GestionVuelo {
    PriorityQueue<Vuelo> colaVuelo = new PriorityQueue<>();
   PriorityQueue<Vuelo> colaRespaldo = new PriorityQueue<>();
   Vuelo vuelo;
    Scanner leer=new Scanner(System.in);
    public void agregarVuelo(){
        System.out.println("ingrese la ID del vuelo: ");
        int nVuelo=leer.nextInt();
        leer.nextLine();
        System.out.println("ingrese el origen del  vuelo: ");
        String origenVuelo=leer.nextLine();
        System.out.println("ingrese el destino del vuelo: ");
        String destinoVuelo=leer.nextLine();
        System.out.println("ingrese la hora estimada de salida: ");
        int horaSalida=leer.nextInt();
      LocalDateTime dateTime = 
          LocalDateTime.ofEpochSecond(horaSalida, 0, ZoneOffset.UTC);
        colaVuelo.offer(new Vuelo(nVuelo, origenVuelo, destinoVuelo, dateTime ));
        colaRespaldo.offer(new Vuelo(nVuelo, origenVuelo, destinoVuelo, dateTime ));
    }
    public void modificarVuelo(){
        
    }


}
