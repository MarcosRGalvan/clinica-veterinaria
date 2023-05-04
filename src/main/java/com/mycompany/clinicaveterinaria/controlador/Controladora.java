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

    public void borrarMascota(int num_cliente) {
        controlModel.borrarMascotas(num_cliente);
    }

    public Mascota traerMascota(int num_cliente) {
       return controlModel.traerMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco, String nombreMasco, String especie,
            String color, String observaciones, String alergico, String atenEsp, 
            String nombreDueño, String celDueño) {
        
        masco.setNombre(nombreMasco);
        masco.setEspecie(especie);
        masco.setColor(color);
        masco.setObservaciones(observaciones);
        masco.setAtencion_especial(atenEsp);
        masco.setAlergico(alergico);
        
        //modifico mascota
        controlModel.modificarMascota(masco);
        
        Dueño dueno = this.buscarDuenio(masco.getUnDueño().getId_duenio());
        dueno.setCelDuenio(celDueño);
        dueno.setNombre(nombreDueño);
        
        //llamar a modificar duenio
        this.modificarDuenio(dueno);
    }

    private Dueño buscarDuenio(int id_duenio) {
        return controlModel.traerDuenio(id_duenio);
    }

    private void modificarDuenio(Dueño dueno) {
        controlModel.modificarDuenio(dueno);
    }

} 

