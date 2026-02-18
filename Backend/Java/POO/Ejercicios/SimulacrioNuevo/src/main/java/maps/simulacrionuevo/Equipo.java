/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maps.simulacrionuevo;

import java.util.ArrayList;

/**
 *
 * @author javie
 */
public class Equipo {
    private String id, nombre;
    private ArrayList<Integrante> integrantesEquipo;
    private ArrayList<Investigacion> investigaciones;
    
   
    public Equipo() {
    }

    public Equipo(String id, String nombre, ArrayList<Integrante> integrantesEquipo, ArrayList<Investigacion> investigaciones) {
        this.id = id;
        this.nombre = nombre;
        this.integrantesEquipo = integrantesEquipo;
        this.investigaciones = investigaciones;
        }

   
    public String getId() {
        return id;
    }

    public ArrayList<Integrante> getIntegrantesEquipo() {
        return integrantesEquipo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setIntegrantesEquipo(ArrayList<Integrante> integrantesEquipo) {
        this.integrantesEquipo = integrantesEquipo;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public ArrayList<Investigacion> getInvestigaciones() {
        return investigaciones;
    }

    public void setInvestigaciones(ArrayList<Investigacion> investigaciones) {
        this.investigaciones = investigaciones;
    }

    @Override
    public String toString() {
        return super.toString(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
}
