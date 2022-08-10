//package group_mintic.registro;

public class Estudiante{

    private final String tipo;
    private final String nombre;
    private final int edad;
    private final String programa;
    private final String tipo_etnia;
    
    public Estudiante(String tipo,String nombre,int edad, String programa, String tipo_etnia) {
        this.tipo=tipo;
        this.nombre=nombre;
        this.edad= edad;
        this.programa=programa;
        this.tipo_etnia=tipo_etnia;
        }
   @Override
   
 public String toString(){
  String output;
  output = "\tEstudiante: "+tipo+"\n\tNombre: "+nombre+"\n\tEdad: "+edad+" anios"+"\n\tPrograma: "+programa+"\n\tEtnia: "+tipo_etnia;
        
  return output;
    }

public void imprimir(){
  String output;
  output = "\tEstudiante: "+tipo+"\n\tNombre: "+nombre+"\n\tEdad: "+edad+" anios"+"\n\tPrograma: "+programa+"\n\tEtnia: "+tipo_etnia;
        
  System.out.println(output);
    }   
}