/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueba;

import Dao.MascotaDao;

/**
 *
 * @author DIANA
 */
public class Ejemplo6 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        MascotaDao dao = new MascotaDao();
        int numeroMascotas = dao.obtenerCantidadMascotas();
        System.out.println("numero de mascotas: "+numeroMascotas);
    }
    
}
