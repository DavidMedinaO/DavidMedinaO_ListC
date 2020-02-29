/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listas;

/**
 *
 * @author Estefania
 */
public class Videos implements Comparable {
    
    private String cancion;  
    
    public Videos(String cancion){
        
        this.cancion = cancion; 
    
    
    }

    @Override
    public int compareTo(Object arg0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    /**
     * @return the cancion
     */
    public String getCancion() {
        return cancion;
    }

    /**
     * @param cancion the cancion to set
     */
    public void setCancion(String cancion) {
        this.cancion = cancion;
    }
    
}
