/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;
import java.math.BigDecimal;
import java.util.Iterator;
import java.util.List;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import Modelos.*;
import static javassist.CtMethod.ConstParameter.string;
/**
 *
 * @author wendy
 */
public class Operacciones {
       
    
    public void alta(Persona per) {
     SessionFactory sesion = NewHibernateUtil.getSessionFactory();
     Session session;
     session = sesion.openSession();
     Transaction tx =session.beginTransaction();
     session.save(per);
     
    Query q=session.createQuery("from Persona");
        for (Iterator iterator = q.iterate(); iterator.hasNext();) {
            Object next = iterator.next();
            
        }
     
     
     tx.commit();
     session.close();
     
     
     
     JOptionPane.showMessageDialog(null, "agregado con exito");
     
     
     
     
     
     
    } 
    
    public void delete(Persona clave) {
         SessionFactory sesion = NewHibernateUtil.getSessionFactory();
     Session session;
     session = sesion.openSession();
     Transaction tx =session.beginTransaction();
     session.delete(clave);
     tx.commit();
     session.close();
     JOptionPane.showMessageDialog(null, "eliminado");
     
    }
    
    public void actualizar(Persona per){
      SessionFactory sesion = NewHibernateUtil.getSessionFactory();
     Session session;
     session = sesion.openSession();
     Transaction tx =session.beginTransaction();
     session.update(per);
     tx.commit();
     session.close();
     JOptionPane.showMessageDialog(null, "actualizado");
        
    }
    
   public  void buscar(Persona clave){
     SessionFactory sesion = NewHibernateUtil.getSessionFactory();
     Session session;
     session = sesion.openSession();
     Transaction tx =session.beginTransaction();
      Query q=session.createQuery("from Persona");
        for (Iterator iterator = q.iterate(); iterator.hasNext();) {
            Object next = iterator.next();
            
        }
   }
   
    
   
}