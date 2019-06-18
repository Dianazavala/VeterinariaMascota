/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package managerdbean;

import Dao.MascotaDao;
import entidades.Mascota;
import java.util.ArrayList;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;


/**
 *
 * @author DIANA
 */
@ManagedBean
@ViewScoped
public class MascotaBean {
    private Mascota mascota;

    public MascotaBean() {
        mascota=new Mascota();
    }
    

    public Mascota getMascota() {
        return mascota;
    }

    public void setMascota(Mascota mascota) {
        this.mascota = mascota;
    }
    
    public String guardar(){
        MascotaDao dao = new MascotaDao();
        dao.guardarMascota(mascota);
        return "/RegistroMascota";
    }
    
    public ArrayList<Mascota> listar(){
        ArrayList<Mascota>milista = new ArrayList<>();
        MascotaDao dao = new MascotaDao();
        milista = dao.listarMascota();
        return milista;
        
    }

    public String actualizarMascota(){
        MascotaDao dao = new MascotaDao();
        dao.actualizar(mascota);
        return "/RegistroMascota";
    }
    
    public String limpiar(){
        mascota = new Mascota();
        limpiar();
        return "/RegistroMascota";
    }
    
    public String eliminar(Mascota mascota){
        MascotaDao dao = new MascotaDao();
        dao.eliminar(mascota);
        return "/RegistroMascota";
    }
}
