
package prueba2;

import java.util.Objects;


public class Estudiantes {
    
    private String nombre;
    private int edad;
    private Materias [] materia;
    
    //*Constructor
    
    //*Setter y Getter(s)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    
    /*public Materias getMateria() {
        return materia;
    }

    public void setMateria(Materias materia) {
        this.materia = materia;
    }*/
    
    //Sobreescribir el equals
   


    public Materias[] getMateria() {
        return materia;
    }

    public void setMateria(Materias[] materia) {
        this.materia = materia;
    }
    
     @Override
   public boolean equals(Object objeto){
        final Estudiantes otroEstudiante = (Estudiantes)objeto;
        
        if(this.nombre.equals(otroEstudiante.nombre)){
            if(this.edad == otroEstudiante.edad){
                
                for(int i=0; i<materia.length; i++){
                    for(int j=0; j<materia.length; j++){
                      if(this.materia[i].equals(otroEstudiante.materia[j])){
                          
                      return true;
                    }
                   
                    }
                
                }
               
            
            }      
        }
    
        return false;
    }

    @Override
    public String toString() {
        
        String materiasEstudiantes = " ";
        for(int i=0; i<materia.length; i++){
            materiasEstudiantes += materia[i]+"\n"; 
        }
        
        return "Informacion Estudiante: "+"\n"+
                "Nombre: "+nombre+"\n"+
                "Edad: "+edad+"\n"+
                "Marerias: "+materiasEstudiantes+"\n";
       
    }
    
    
    
}
