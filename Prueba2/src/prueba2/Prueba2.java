
package prueba2;

import java.util.Scanner;


public class Prueba2 {

   
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner entrada = new Scanner(System.in);
        Estudiantes[] alumno = new Estudiantes[5]; //Un arreglo de 5 estudiantes
         Materias[] materias = new Materias[2];//Un arreglo de 2 materias
         
         System.out.println("Nombre: Jhonathan Pizarra");
         System.out.println("Curso: Tec-SMD");
         System.out.println("Prueba #2");
         System.out.println("");
         System.out.println("Comienzo del programa...");
        System.out.println("    Información del estudiante");
        
        for(int i= 0; i< alumno.length; i++){
            
            alumno[i] = new Estudiantes();
            System.out.print("Ingrese el nombre del Estudiante ["+(i+1)+"]");
            String nombreEstudiante = entrada.next();
            alumno[i].setNombre(nombreEstudiante);
            
            System.out.print("Ingrese la edad del Estudiante: ["+(i+1)+"]");
            int edadEstudiante = entrada.nextInt();
            alumno[i].setEdad(edadEstudiante);
            
            System.out.println("");
            System.out.println("    Materias del Estudiante ["+(i+1)+"]");
            System.out.println("##Informacion Materias##");
            
             for(int j=0; j<materias.length; j++){
                    materias[j] = new  Materias();

                    System.out.print("Ingrese el nombre de la materia ["+(j+1)+"]: ");
                    String nombreMateria = entrada.next();
                    materias[j].setMaterias(nombreMateria);

                    System.out.print("Ingrese el nivel de la materia ["+(j+1)+"]: ");
                    int nivelMateria = entrada.nextInt();
                    materias[j].setNivel(nivelMateria);

                    //Colocar al alumno [0] las amterias que le correspondan
                
            } 
             System.out.println("");
             alumno[i].setMateria(materias);
           
            
            for(int k=0; k<alumno.length; k++){
               
                    if(alumno[k] != null){

                    if(i ==k){
                     //System.out.println("El alumno ["+(i+1)+ " y "+ "["+(k+1)+"], son iguales");
                    }else if(alumno[i].equals(alumno[k])){
                        System.out.println("El alumno ["+(i+1)+ " y "+ "["+(k+1)+"], son iguales");

                     } 
                
                    }else{
                      //Nada
                    break;
              
                }
      
             } 
               
            
            
           }
       
        
        
        
        
        System.out.println("");
        System.out.println("Se han ingresado alumnos con los sigueinte datos: ");
        for(int i=0; i<alumno.length; i++){
            
            System.out.println(alumno[i]);
            System.out.println(".................");
        
        }
        
    }
    
}
