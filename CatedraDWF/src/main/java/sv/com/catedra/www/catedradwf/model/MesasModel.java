package sv.com.catedra.www.catedradwf.model;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import sv.com.catedra.www.catedradwf.entities.MesasEntity;


public class MesasModel {
    SessionFactory factory = HibernateUtil.getSessionFactory();
    public int insertarMesas(MesasEntity mesas) {
        Session ses = factory.openSession();
        try {
            Transaction tran = ses.beginTransaction();
            ses.save(mesas);
            tran.commit();
            ses.close();
            return 1;
        } catch (Exception e) {
            ses.close();
            return 0;
        }
    }
    public List<MesasEntity> listarMesas(){
        SessionFactory sesFac = HibernateUtil.getSessionFactory();
        Session ses = sesFac.openSession();
        ArrayList<MesasEntity> ListaMesas = new ArrayList<MesasEntity>();
        String sql = "from MesasEntity ";
        ListaMesas  = (ArrayList<MesasEntity>) ses.createQuery(sql).list();
        return listarMesas();
    }
    public MesasEntity obtenerMesa(String codigo) {
        Session ses= factory.openSession();
        try {
            MesasEntity mesas = (MesasEntity) ses.get(MesasEntity.class, codigo);
            ses.close();
            return mesas;
        }
        catch(Exception e){
            ses.close();
            return null;
        }
    }
    public int modificarMesa(MesasEntity mesas) {
        Session ses = factory.openSession();
        try {
            Transaction tran = ses.beginTransaction();
            ses.update(mesas);
            tran.commit();
            ses.close();
            return 1;
        } catch (Exception e) {
            ses.close();
            return 0;
        }
    }
    public int eliminarMesa(String id){
        int filasAfectadas=0;
        Session ses= factory.openSession();
        try{
            MesasEntity reservas= (MesasEntity) ses.get(MesasEntity.class, id);
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