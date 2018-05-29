
package prueba2;


public class Materias {
    
    private String materias;
    private int nivel;
    
    //* Contructor
    
    //*Setter y Getter(s)

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    public int getNivel() {
        return nivel;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    @Override
    public String toString() {
        
        return "Informacion Materias.."+"\n"+
                "Nombre de Materia: "+materias+"\n"+
                "Nivel: "+nivel+"\n";
        
    }
    
    
    
    
}
