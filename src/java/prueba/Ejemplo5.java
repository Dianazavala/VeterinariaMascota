/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import Dao.MascotaDao;
import entidades.Mascota;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author DIANA
 */
public class Ejemplo5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MascotaDao mascotadao = new MascotaDao();
        
        List<Mascota> listarMascotas=null;
        
        try {
            listarMascotas = mascotadao.listarWhereNombre("Sandor");
        } catch (Exception ex) {
            Logger.getLogger(Ejemplo2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        listarMascotas.forEach((t) -> {
            System.out.println("id:"+t.getIdMascota()+" mascota: "+t.getNombremascota()+" cliente: "+t.getNonbrecliente()+" raza: "+t.getRaza());
        });
    }
    
}
