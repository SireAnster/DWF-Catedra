package sv.com.catedra.www.catedradwf.model;

import java.util.ArrayList;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import sv.com.catedra.www.catedradwf.entities.UsuariosEntity;

public class UsuariosModel {
    SessionFactory factory = HibernateUtil.getSessionFactory();
    public int insertarUsuarios(UsuariosEntity usuarios) {
        Session ses = factory.openSession();
        try {
            Transaction tran = ses.beginTransaction();
            ses.save(usuarios);
            tran.commit();
            ses.close();
            return 1;
        } catch (Exception e) {
            ses.close();
            return 0;
        }
    }
    public List<UsuariosEntity> listarUsuario(){
        SessionFactory sesFac = HibernateUtil.getSessionFactory();
        Session ses = sesFac.openSession();
        ArrayList<UsuariosEntity> ListaUsuario = new ArrayList<UsuariosEntity>();
        String sql = "from UsuariosEntity ";
        ListaUsuario  = (ArrayList<UsuariosEntity>) ses.createQuery(sql).list();
        return listarUsuario();
    }
    public UsuariosEntity obtenerUsuario(String codigo) {
        Session ses= factory.openSession();
        try {
            UsuariosEntity reservas = (UsuariosEntity) ses.get(UsuariosEntity.class, codigo);
            ses.close();
            return reservas;
        }
        catch(Exception e){
            ses.close();
            return null;
        }
    }
    public int modificarUsuario(UsuariosEntity reservas) {
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
    public int eliminarUsuario(String id){
        int filasAfectadas=0;
        Session ses= factory.openSession();
        try{
            UsuariosEntity reservas= (UsuariosEntity) ses.get(UsuariosEntity.class, id);
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
