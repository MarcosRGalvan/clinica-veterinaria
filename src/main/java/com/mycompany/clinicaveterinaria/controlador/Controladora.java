package com.mycompany.clinicaveterinaria.controlador;

import com.mycompany.clinicaveterinaria.modelo.ControladoraModelo;
import java.util.List;


public class Controladora {
    
    ControladoraModelo controlModel = new ControladoraModelo();

    public void guardar(String nombreMasco, String especie, String color, String observaciones, 
                        String alergico, String atenEsp, 
                        String nombreDueño, String celDueño) {
        
        //Creamos al dueño y asignamos sus valores
        Dueño dueño = new Dueño();
        dueño.setNombre(nombreDueño);
        dueño.setCelDuenio(celDueño);
        
        //Creamos la mascota y asignamos sus valores
        Mascota masco = new Mascota();
        masco.setNombre(nombreMasco);
        masco.setEspecie(especie);
        masco.setColor(color);
        masco.setAlergico(alergico);
        masco.setAtencion_especial(atenEsp);
        masco.setObservaciones(observaciones);
        masco.setUnDueño(dueño);
        
        
        controlModel.guardar(dueño,masco);
    }

    public List<Mascota> traerMascotas() {
        return controlModel.traerMascotas();
    }

} 

