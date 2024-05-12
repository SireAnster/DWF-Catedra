package sv.com.catedra.www.catedradwf.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "tipo_usuarios", schema = "dwf_catedra", catalog = "")
public class TipoUsuariosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "Tipo de usuario", nullable = false, length = 30)
    private String tipoDeUsuario;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(String tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }
}
