/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package beans.model;

import javax.inject.Named;
import javax.enterprise.context.RequestScoped;

/**
 *
 * @author Desarrollo2
 */
@Named(value = "candidato")
@RequestScoped
public class Candidato {

    /**
     * Creates a new instance of Candidato
     */
    public Candidato() {
    }
    
    private String nombre = "escribirsd  nombre";

    /**
     * Get the value of nombre
     *
     * @return the value of nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Set the value of nombre
     *
     * @param nombre new value of nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
