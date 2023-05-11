package paquete;
import java.time.LocalDateTime;
public class Vuelo implements Comparable<Vuelo> {
    private int n_vuelo;
    private String origen;
    private String destino;
    LocalDateTime hSalida;
    public int getN_vuelo() {
        return n_vuelo;
    }
    public void setN_vuelo(int n_vuelo) {
        this.n_vuelo = n_vuelo;
    }
    public String getOrigen() {
        return origen;
    }
    public void setOrigen(String origen) {
        this.origen = origen;
    }
    public String getDestino() {
        return destino;
    }
    public void setDestino(String destino) {
        this.destino = destino;
    }
    public LocalDateTime getHsalida() {
        return hSalida;
    }
    public void setHsalida(LocalDateTime horaSalida) {
        this.hSalida = horaSalida;
    }
    public Vuelo(int n_vuelo, String origen, String destino, LocalDateTime horaSalida) {
        this.n_vuelo = n_vuelo;
        this.origen = origen;
        this.destino = destino;
        this.hSalida = horaSalida;
    }
   @Override
       public int compareTo(Vuelo vuelo) {
           // TODO Auto-generated method stub
          return  this. hSalida.compareTo(vuelo.getHsalida());
         
       }





}
