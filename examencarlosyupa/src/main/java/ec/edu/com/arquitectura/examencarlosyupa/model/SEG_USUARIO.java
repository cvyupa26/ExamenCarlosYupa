package ec.edu.com.arquitectura.examencarlosyupa.model;

import java.math.BigDecimal;
import java.sql.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "SEG_USUARIO")
public class SEG_USUARIO {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "ID_USUARIO", nullable = false)
    private Integer id_usuario;
    @Column(name = "MAIL", nullable = false, length = 128)
    private String mail;
    @Column(name = "CLAVE", nullable = false, length = 64)
    private String clave;
    @Column(name = "NOMBRE", nullable = false, length = 128)
    private String nombre;
    @Column(name = "INTENTOS_FALLIDOS", precision = 8, scale = 0, nullable = false)
    private BigDecimal intentosfallidos;
    @Column(name = "SUELDO", precision = 8, scale = 2, nullable = false)
    private BigDecimal sueldo;
    @Column(name = "FECHA_NACIMIENTO", nullable = false)
    private Date fechanacimiento;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    public SEG_USUARIO() {
    }

    public SEG_USUARIO(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public Integer getId_usuario() {
        return id_usuario;
    }

    public void setId_usuario(Integer id_usuario) {
        this.id_usuario = id_usuario;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BigDecimal getIntentosfallidos() {
        return intentosfallidos;
    }

    public void setIntentosfallidos(BigDecimal intentosfallidos) {
        this.intentosfallidos = intentosfallidos;
    }

    public BigDecimal getSueldo() {
        return sueldo;
    }

    public void setSueldo(BigDecimal sueldo) {
        this.sueldo = sueldo;
    }

    public Date getFechanacimiento() {
        return fechanacimiento;
    }

    public void setFechanacimiento(Date fechanacimiento) {
        this.fechanacimiento = fechanacimiento;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((id_usuario == null) ? 0 : id_usuario.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        SEG_USUARIO other = (SEG_USUARIO) obj;
        if (id_usuario == null) {
            if (other.id_usuario != null)
                return false;
        } else if (!id_usuario.equals(other.id_usuario))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SEG_USUARIO [id_usuario=" + id_usuario + ", mail=" + mail + ", clave=" + clave + ", nombre=" + nombre
                + ", intentosfallidos=" + intentosfallidos + ", sueldo=" + sueldo + ", fechanacimiento="
                + fechanacimiento + ", version=" + version + "]";
    }

}
