/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interfaces;

import entidades.Mascota;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author DIANA
 */
public interface IMascota {
   public abstract void guardarMascota(Mascota masccota);
    
     public abstract List<Mascota> listar();
    
    public abstract void actualizar(Mascota mascota);
    
    public abstract List<Mascota> listarWhereRaza(String filtro);
    
    public abstract List<Mascota> listarWhereNombre(String filtro);
    
    public abstract int obtenerCantidadMascotas();
    
}
