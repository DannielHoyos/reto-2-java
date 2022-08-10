//package group_mintic.registro;

public class Pregrado extends Estudiante {
 private final int cant_creditos;
 
 
 public Pregrado(String tipo,String nombre, int edad, String programa, String tipo_etnia,int cant_creditos) {
      super(tipo,nombre,edad,programa,tipo_etnia);
        this.cant_creditos=cant_creditos;
       
    }
    
    /**
     *
     * @return
     */
    @Override
    
   public String toString(){
        String output=super.toString();
        output += "\n\tCreditos aprobados: "+cant_creditos;
        return output;
      }
}