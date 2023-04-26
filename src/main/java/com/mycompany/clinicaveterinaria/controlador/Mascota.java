package com.mycompany.clinicaveterinaria.controlador;

import java.io.Serializable;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity 
public class Mascota implements Serializable {
    
    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int num_clinte;
    private String nombre;
    private String color;
    private String especie;
    private String alergico;
    private String atencion_especial;
    private String observaciones;
    @OneToOne
    private Dueño unDueño;

    public Mascota() {
        
    }

    public Mascota(int num_clinte, String nombre, String color, String especie, String alergico, String atencion_especial, String observaciones, Dueño unDueño) {
        this.num_clinte = num_clinte;
        this.nombre = nombre;
        this.color = color;
        this.especie = especie;
        this.alergico = alergico;
        this.atencion_especial = atencion_especial;
        this.observaciones = observaciones;
        this.unDueño = unDueño;
    }

    public int getNum_clinte() {
        return num_clinte;
    }

    public void setNum_clinte(int num_clinte) {
        this.num_clinte = num_clinte;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public String getAlergico() {
        return alergico;
    }

    public void setAlergico(String alergico) {
        this.alergico = alergico;
    }

    public String getAtencion_especial() {
        return atencion_especial;
    }

    public void setAtencion_especial(String atencion_especial) {
        this.atencion_especial = atencion_especial;
    }

    public String getObservaciones() {
        return observaciones;
    }

    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }

    public Dueño getUnDueño() {
        return unDueño;
    }

    public void setUnDueño(Dueño unDueño) {
        this.unDueño = unDueño;
    }
    
    
}
