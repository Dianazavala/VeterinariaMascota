/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Interfaces.IMascota;
import Utilitarios.HibernateUtil;
import entidades.Mascota;
import java.util.ArrayList;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author DIANA
 */
public class MascotaDao implements IMascota{

    @Override
    public void guardarMascota(Mascota mascota) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transacccion = session.beginTransaction();
        
        
        session.save(mascota);
        transacccion.commit();
        
        session.close();
        
        
    }

    @Override
    public ArrayList<Mascota> listarMascota() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        ArrayList<Mascota> milista = new ArrayList<>();
             
        Query query = session.createQuery("FROM Mascota");
        milista = (ArrayList<Mascota>)query.list();
        return milista;
    }
    

    @Override
    public void actualizar(Mascota mascota) {
    Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = session.beginTransaction();
        session.update(mascota);
        transaccion.commit();
        
        session.close();
    }

    @Override
    public List<Mascota> listarWhereRaza(String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Mascota> listarWhereNombre(String filtro) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int obtenerCantidadMascotas() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
   public void eliminar (Mascota mascota){
       Session session = HibernateUtil.getSessionFactory().openSession();
        Transaction transaccion = session.beginTransaction();
        session.delete(mascota);
        transaccion.commit();
        
        session.close();
       
   }
    
    
}
