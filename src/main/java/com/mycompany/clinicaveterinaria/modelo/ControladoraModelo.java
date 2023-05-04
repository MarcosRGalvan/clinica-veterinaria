package com.mycompany.clinicaveterinaria.modelo;

import com.mycompany.clinicaveterinaria.controlador.Dueño;
import com.mycompany.clinicaveterinaria.controlador.Mascota;
import com.mycompany.clinicaveterinaria.modelo.exceptions.NonexistentEntityException;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;


public class ControladoraModelo {
    
DueñoJpaController dueñoJpa = new DueñoJpaController();
MascotaJpaController mascoJpa = new MascotaJpaController(); 

    public void guardar(Dueño dueño, Mascota masco) {
        //crear en la BD el dueño
        dueñoJpa.create(dueño);
        
        //crear en la BD la mascota
        mascoJpa.create(masco);
    }

    public List<Mascota> traerMascotas() {
        return mascoJpa.findMascotaEntities();
    }

    public void borrarMascotas(int num_cliente) {
    try {
        mascoJpa.destroy(num_cliente);
    } catch (NonexistentEntityException ex) {
        Logger.getLogger(ControladoraModelo.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    public Mascota traerMascota(int num_cliente) {
        return mascoJpa.findMascota(num_cliente);
    }

    public void modificarMascota(Mascota masco) {
    try {
        mascoJpa.edit(masco);
    } catch (Exception ex) {
        Logger.getLogger(ControladoraModelo.class.getName()).log(Level.SEVERE, null, ex);
    }
    }

    public Dueño traerDuenio(int id_duenio) {
        return dueñoJpa.findDueño(id_duenio);
    }

    public void modificarDuenio(Dueño dueno) {
    try {
        dueñoJpa.edit(dueno);
    } catch (Exception ex) {
        Logger.getLogger(ControladoraModelo.class.getName()).log(Level.SEVERE, null, ex);
    }
    }
    
}
