/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package maps.ejercicio1.clases;

/**
 *
 * @author javie
 */
public abstract class Empleado {

    private String nombre, apellido1, apellido2;
    private double salarioAnual;

    public Empleado(String nombre, String apellido1, String apellido2, double salarioAnual) {
        this.nombre = nombre;
        this.apellido1 = apellido1;
        this.apellido2 = apellido2;
        this.salarioAnual = salarioAnual;
    }

    public String getApellido1() {
        return apellido1;
    }

    public String getApellido2() {
        return apellido2;
    }

    public String getNombre() {
        return nombre;
    }

    public double getSalarioAnual() {
        return salarioAnual;
    }

}
