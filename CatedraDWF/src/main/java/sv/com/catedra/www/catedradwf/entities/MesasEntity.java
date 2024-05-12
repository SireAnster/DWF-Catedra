package sv.com.catedra.www.catedradwf.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "mesas", schema = "dwf_catedra", catalog = "")
public class MesasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "Codigo de mesa", nullable = false, length = 6)
    private String codigoDeMesa;
    @Basic
    @Column(name = "Disponibilidad", nullable = false, length = 15)
    private String disponibilidad;

    public String getCodigoDeMesa() {
        return codigoDeMesa;
    }

    public void setCodigoDeMesa(String codigoDeMesa) {
        this.codigoDeMesa = codigoDeMesa;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }
}
