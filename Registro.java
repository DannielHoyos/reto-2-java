//package group_mintic.registro;
import java.util.Scanner;

public class Registro {
     private final String nombre;
     private final Estudiante[] estudiantes;
     private int ultimo;

    
    Registro(String nombre){
    estudiantes =new Estudiante[100];
    this.nombre=nombre;
    ultimo=0;

    }
  public void agregarEstudiante(Estudiante estudiante){
        estudiantes[ultimo] = estudiante;
        ultimo++;
    }   
public void listarEstudiantes(){
    System.out.println("***Listado de estudiantes***");
        for(int i =0; i < ultimo; i++){
            System.out.println(estudiantes[i]);  
        }
    } 
 public int procesarComandos(String comando){
    
        String[] comandoArr = comando.split("&");  

        int opcion = Integer.parseInt(comandoArr[0]);

        switch(opcion){
            case 1: {
                String tipo = comandoArr[1];
                String nombre = comandoArr[2];
                int edad = Integer.parseInt(comandoArr[3]);
                String programa = comandoArr[4];
                String tipo_etnia = comandoArr[5];
                
                
                if( tipo.equals("Pregrado")){
                    int cant_creditos= Integer.parseInt(comandoArr[6]);
                    Pregrado pre = new Pregrado(tipo,nombre,edad,programa,tipo_etnia,cant_creditos);
                    agregarEstudiante(pre);
                } else {
                    String modalidad = comandoArr[6];
                    Posgrado pos = new Posgrado(tipo,nombre,edad,programa,tipo_etnia,modalidad);
                    agregarEstudiante(pos);
                }
            break;
            }
            case 2:{ 
            listarEstudiantes();
            break; 
            }
            case 3: {
            break;
            }
            
        }
            return opcion;
 }

public static void main(String[] args){
        int opcion;
        Registro lista = new Registro("Universidad Nacional");
        System.out.println("Seleccione una opción: ");
        Scanner sc = new Scanner(System.in);
    
        do{
            String linea = sc.nextLine();
            opcion = lista.procesarComandos(linea);
        }while(opcion != 3);
    
    }
    
}