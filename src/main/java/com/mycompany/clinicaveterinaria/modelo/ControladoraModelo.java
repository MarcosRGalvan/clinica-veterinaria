package com.mycompany.clinicaveterinaria.modelo;

import com.mycompany.clinicaveterinaria.controlador.Dueño;
import com.mycompany.clinicaveterinaria.controlador.Mascota;
import java.util.List;


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
    
}
