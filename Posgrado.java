//package group_mintic.registro;

public class Posgrado extends Estudiante {
  private final String modalidad;
  
  
  public Posgrado(String tipo,String nombre,int edad, String programa, String tipo_etnia, String modalidad ) {
        super(tipo,nombre,edad,programa,tipo_etnia);
        this.modalidad=modalidad;
        
  }
    @Override
   public String toString(){
        String output=super.toString();
        output +="\n\tModalidad:"+modalidad;
        return output;
      }
}
    

