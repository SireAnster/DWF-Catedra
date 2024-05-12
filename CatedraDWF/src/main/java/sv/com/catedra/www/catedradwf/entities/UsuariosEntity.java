package sv.com.catedra.www.catedradwf.entities;

import jakarta.persistence.*;

@Entity
@Table(name = "usuarios", schema = "dwf_catedra", catalog = "")
public class UsuariosEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "DUI", nullable = false, length = 10)
    private String dui;
    @Basic
    @Column(name = "Nombres", nullable = false, length = 300)
    private String nombres;
    @Basic
    @Column(name = "Apellidos", nullable = false, length = 300)
    private String apellidos;
    @Basic
    @Column(name = "Contraseña", nullable = false, length = 50)
    private String contraseña;
    @Basic
    @Column(name = "Correo Electronico", nullable = false, length = 200)
    private String correoElectronico;
    @Basic
    @Column(name = "Telefono", nullable = true, length = 15)
    private String telefono;
    @Basic
    @Column(name = "Tipo de usuario", nullable = false)
    private int tipoDeUsuario;
    @Basic
    @Column(name = "#n de tarjeta", nullable = false)
    private int nDeTarjeta;

    public String getDui() {
        return dui;
    }

    public void setDui(String dui) {
        this.dui = dui;
    }

    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getTipoDeUsuario() {
        return tipoDeUsuario;
    }

    public void setTipoDeUsuario(int tipoDeUsuario) {
        this.tipoDeUsuario = tipoDeUsuario;
    }

    public int getnDeTarjeta() {
        return nDeTarjeta;
    }

    public void setnDeTarjeta(int nDeTarjeta) {
        this.nDeTarjeta = nDeTarjeta;
    }
}
