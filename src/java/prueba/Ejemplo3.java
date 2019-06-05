/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import Dao.MascotaDao;
import entidades.Mascota;

/**
 *
 * @author DIANA
 */
public class Ejemplo3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       MascotaDao mascotaDao = new MascotaDao();
        
        Mascota mascota = new Mascota(1, "lisi", "Maria", "Snahuser");
        
        mascotaDao.actualizar(mascota);

    }
    
}
