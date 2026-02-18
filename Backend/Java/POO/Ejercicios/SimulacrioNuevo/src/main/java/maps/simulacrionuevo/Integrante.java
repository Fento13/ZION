/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maps.simulacrionuevo;

/**
 *
 * @author javie
 */
public class Integrante {
    private String id, nombre, apellido1, apellido2;
    private Especialidades especialidad;
    private boolean esLider;
    public Integrante() {
    }

    public Integrante(String id, String nombre, String apellido1, String apellido2, Especialidades especialidad, boolean esLider) {
        this.id = id;
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.especialidad = especialidad;
        this.esLider = esLider;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getId() {
        return id;
    }

    public Especialidades getEspecialidad() {
        return especialidad;
    }

    public void setApellido1(String apellido1) {
        this.apellido1 = apellido1;
    }

    public void setApellido2(String apellido2) {
        this.apellido2 = apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setEspecialidad(Especialidades especialidad) {
        this.especialidad = especialidad;
    }
   
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

   
    public boolean isEsLider() {
        return esLider;
    }

    public void setEsLider(boolean esLider) {
        this.esLider = esLider;
    }
    
    
}
