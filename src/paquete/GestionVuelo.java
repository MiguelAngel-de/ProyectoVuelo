package paquete;
import java.util.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
public class GestionVuelo {
    PriorityQueue<Vuelo> colaVuelo = new PriorityQueue<>();
   PriorityQueue<Vuelo> colaRespaldo = new PriorityQueue<>();
   Vuelo vuelo;
    Scanner leer=new Scanner(System.in);
    int nVuelo;
    String origenVuelo;
    String destinoVuelo;
    String horaSalida;
    String fechaSalida;
    public void agregarVuelo(){
        System.out.println("ingrese la ID del vuelo: ");
         nVuelo=leer.nextInt();
        leer.nextLine();
        System.out.println("ingrese el origen del  vuelo: ");
         origenVuelo=leer.nextLine();
        System.out.println("ingrese el destino del vuelo: ");
         destinoVuelo=leer.nextLine();
         System.out.println("introduzca la hora (HH:MM:SS)");
        horaSalida=leer.nextLine();
        System.out.println("introduzca la fecha(dd-MM-yyy): ");
        fechaSalida=leer.nextLine();
       
        LocalDateTime dateTime= LocalDateTime.of(LocalDate.parse(fechaSalida, DateTimeFormatter.ofPattern("dd-MM-yyy")), LocalTime.parse(horaSalida, DateTimeFormatter.ofPattern("HH:mm:ss")));
      
        colaVuelo.offer(new Vuelo(nVuelo, origenVuelo, destinoVuelo, dateTime ));
        colaRespaldo.offer(new Vuelo(nVuelo, origenVuelo, destinoVuelo, dateTime ));
    }
    public void modificarVuelo(){
     System.out.println("introduzca la hora (HH:MM:SS)");
        String horaModificar=leer.nextLine();
        leer.nextLine();
        System.out.println("introduzca la fecha(dd-MM-yyy): ");
       
        String fechaModificar=leer.nextLine();
        LocalDateTime dateTimeModifit= LocalDateTime.of(LocalDate.parse(fechaModificar, DateTimeFormatter.ofPattern("dd-MM-yyy")), LocalTime.parse(horaModificar, DateTimeFormatter.ofPattern("HH:mm:ss")));
   
        colaRespaldo.offer(new Vuelo(nVuelo, origenVuelo, destinoVuelo, dateTimeModifit ));
    }
    public void eliminarVuelo(){
        System.out.println("el vuelo eliminado es: "+colaVuelo.poll());
    }



}
