package sv.com.catedra.www.catedradwf.model;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import sv.com.catedra.www.catedradwf.entities.ReservasEntity;

public class ReservasModel {
    SessionFactory factory = HibernateUtil.getSessionFactory();
    public int insertarEditorial(ReservasEntity reservas) {
        Session ses = factory.openSession();
        try {
            Transaction tran = ses.beginTransaction();
            ses.save(reservas);
            tran.commit();
            ses.close();
            return 1;
        } catch (Exception e) {
            ses.close();
            return 0;
        }
    }
    public List<ReservasEntity> listarReservas(){
        SessionFactory sesFac = HibernateUtil.getSessionFactory();
        Session ses = sesFac.openSession();
        ArrayList<ReservasEntity> ListaReserva = new ArrayList<ReservasEntity>();
        String sql = "from ReservasEntity ";
        ListaReserva  = (ArrayList<ReservasEntity>) ses.createQuery(sql).list();
        return listarReservas();
    }
    public ReservasEntity obtenerReserva(String codigo) {
        Session ses= factory.openSession();
        try {
            ReservasEntity reservas = (ReservasEntity) ses.get(ReservasEntity.class, codigo);
            ses.close();
            return reservas;
        }
        catch(Exception e){
            ses.close();
            return null;
        }
    }
    public int modificarReserva(ReservasEntity reservas) {
        Session ses = factory.openSession();
        try {
            Transaction tran = ses.beginTransaction();
            ses.update(reservas);
            tran.commit();
            ses.close();
            return 1;
        } catch (Exception e) {
            ses.close();
            return 0;
        }
    }
    public int eliminarReserva(String id){
        int filasAfectadas=0;
        Session ses= factory.openSession();
        try{
            ReservasEntity reservas= (ReservasEntity) ses.get(ReservasEntity.class, id);
            if(reservas!=null){
                Transaction tran= ses.beginTransaction();
                ses.delete(reservas);
                tran.commit();
                filasAfectadas=1;
            }
            ses.close();
            return filasAfectadas;
        }
        catch(Exception e){
            ses.close();
            return filasAfectadas;
        }
    }
}
