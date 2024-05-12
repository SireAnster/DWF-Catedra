package sv.com.catedra.www.catedradwf.entities;

import jakarta.persistence.*;

import java.sql.Date;
import java.sql.Time;

@Entity
@Table(name = "reservas", schema = "dwf_catedra", catalog = "")
public class ReservasEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "ID", nullable = false)
    private int id;
    @Basic
    @Column(name = "Nombre usuario", nullable = false, length = 300)
    private String nombreUsuario;
    @Basic
    @Column(name = "Apellido usuario", nullable = false, length = 300)
    private String apellidoUsuario;
    @Basic
    @Column(name = "Mesa ID", nullable = false, length = 6)
    private String mesaId;
    @Basic
    @Column(name = "Fecha de reserva", nullable = false)
    private Date fechaDeReserva;
    @Basic
    @Column(name = "Cantidad de horas", nullable = false)
    private Time cantidadDeHoras;
    @Basic
    @Column(name = "Telefono", nullable = true, length = 15)
    private String telefono;
    @Basic
    @Column(name = "Correo Electronico", nullable = false, length = 200)
    private String correoElectronico;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombreUsuario() {
        return nombreUsuario;
    }

    public void setNombreUsuario(String nombreUsuario) {
        this.nombreUsuario = nombreUsuario;
    }

    public String getApellidoUsuario() {
        return apellidoUsuario;
    }

    public void setApellidoUsuario(String apellidoUsuario) {
        this.apellidoUsuario = apellidoUsuario;
    }

    public String getMesaId() {
        return mesaId;
    }

    public void setMesaId(String mesaId) {
        this.mesaId = mesaId;
    }

    public Date getFechaDeReserva() {
        return fechaDeReserva;
    }

    public void setFechaDeReserva(Date fechaDeReserva) {
        this.fechaDeReserva = fechaDeReserva;
    }

    public Time getCantidadDeHoras() {
        return cantidadDeHoras;
    }

    public void setCantidadDeHoras(Time cantidadDeHoras) {
        this.cantidadDeHoras = cantidadDeHoras;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }
}
