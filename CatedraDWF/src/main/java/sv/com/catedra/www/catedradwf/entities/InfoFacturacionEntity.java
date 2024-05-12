package sv.com.catedra.www.catedradwf.entities;

import jakarta.persistence.*;

import java.sql.Date;

@Entity
@Table(name = "info_facturacion", schema = "dwf_catedra", catalog = "")
public class InfoFacturacionEntity {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(name = "#N de tarjeta", nullable = false)
    private int nDeTarjeta;
    @Basic
    @Column(name = "Marca de la tarjeta", nullable = false, length = 50)
    private String marcaDeLaTarjeta;
    @Basic
    @Column(name = "Nombre", nullable = false, length = 30)
    private String nombre;
    @Basic
    @Column(name = "Apellido", nullable = false, length = 30)
    private String apellido;
    @Basic
    @Column(name = "Fecha de caducidad", nullable = false)
    private Date fechaDeCaducidad;
    @Basic
    @Column(name = "CVV", nullable = false)
    private int cvv;
    @Basic
    @Column(name = "Telefono", nullable = false, length = 15)
    private String telefono;
    @Basic
    @Column(name = "Correo Electronico", nullable = false, length = 200)
    private String correoElectronico;
    @Basic
    @Column(name = "Direccion", nullable = false, length = 500)
    private String direccion;
    @Basic
    @Column(name = "Segunda direccion", nullable = true, length = 500)
    private String segundaDireccion;
    @Basic
    @Column(name = "Departamento", nullable = false, length = 25)
    private String departamento;

    public int getnDeTarjeta() {
        return nDeTarjeta;
    }

    public void setnDeTarjeta(int nDeTarjeta) {
        this.nDeTarjeta = nDeTarjeta;
    }

    public String getMarcaDeLaTarjeta() {
        return marcaDeLaTarjeta;
    }

    public void setMarcaDeLaTarjeta(String marcaDeLaTarjeta) {
        this.marcaDeLaTarjeta = marcaDeLaTarjeta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Date getFechaDeCaducidad() {
        return fechaDeCaducidad;
    }

    public void setFechaDeCaducidad(Date fechaDeCaducidad) {
        this.fechaDeCaducidad = fechaDeCaducidad;
    }

    public int getCvv() {
        return cvv;
    }

    public void setCvv(int cvv) {
        this.cvv = cvv;
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

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getSegundaDireccion() {
        return segundaDireccion;
    }

    public void setSegundaDireccion(String segundaDireccion) {
        this.segundaDireccion = segundaDireccion;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
}
