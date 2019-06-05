/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Dao;

import Interfaces.IMascota;
import Utilitarios.HibernateUtil;
import entidades.Mascota;
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
    public List<Mascota> listar() {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Mascota";        
        Query query = session.createQuery(hql);
        List< Mascota > lista= (List< Mascota >) query.list();
        return lista;
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
    Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Mascota where raza like '"+filtro+"'";        
        Query query = session.createQuery(hql);
        List< Mascota > lista= (List< Mascota >) query.list();
        return lista;    
    }

    @Override
    public List<Mascota> listarWhereNombre(String filtro) {
        Session session = HibernateUtil.getSessionFactory().openSession();
        String hql = "from Mascota where nombreMascota like '"+filtro+"'";        
        Query query = session.createQuery(hql);
        List< Mascota > lista= (List< Mascota >) query.list();
        return lista; 
    }

    @Override
    public int obtenerCantidadMascotas() {
        String hql = "select count(*) from Mascota";
        Session session = HibernateUtil.getSessionFactory().openSession();
        Query query = session.createQuery(hql);
        Long FilasTab=(Long) query.uniqueResult();
        Integer cont=FilasTab.intValue();
        return cont;    }
    
    
    
}
