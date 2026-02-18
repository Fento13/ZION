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

 public Investigacion(String f1P1, String analisis_teorico_sobre_la_estructura_de_n, LocalDate of, LocalDate of1, LocalDate of2, double par){
 }
 
 public Investigacion(String id, String titulo, LocalDate fechaInicio, LocalDate fechaFinalEstimada, LocalDate fechaFinalReal){
     this.id = id;
     this.titulo = titulo;
     this.fechaInicio = fechaInicio;
     this.fechaFinalEstimada = fechaFinalEstimada;
     this.fechaFinalReal = fechaFinalReal;
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
