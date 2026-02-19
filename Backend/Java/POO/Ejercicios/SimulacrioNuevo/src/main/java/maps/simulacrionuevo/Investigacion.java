package maps.simulacrionuevo;

import java.time.LocalDate;

/**
 *
 * @author javie
 */
public class Investigacion {
 private String id, titulo;
 private LocalDate fechaInicio, fechaFinalEstimada, fechaFinalReal;
 private double presupuesto; 

    public double getPresupuesto() {
        return presupuesto;
    }

 
 public Investigacion(String id, String titulo, LocalDate fechaInicio, LocalDate fechaFinalEstimada, LocalDate fechaFinalReal, double presupuesto){
     this.id = id;
     this.titulo = titulo;
     this.fechaInicio = fechaInicio;
     this.fechaFinalEstimada = fechaFinalEstimada;
     this.fechaFinalReal = fechaFinalReal;
     this.presupuesto = presupuesto;
 }
 
 public String getId(){
     return this.id;
 }

 
 public String getTitulo (){
     return this.titulo;
 }
 
 public LocalDate getFechaInicio(){
     return this.fechaInicio;
 }
 
 public LocalDate getFechaFinalEstimada(){
     return this.fechaFinalEstimada;
 }
 public LocalDate getFechaFinalReal(){
     return this.fechaFinalReal;
 }
}
