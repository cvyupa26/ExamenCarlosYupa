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
    @Column(name = "COD_USUARIO", nullable = false)
    private Integer codigousuario;
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

    public SEG_USUARIO(Integer codigousuario) {
        this.codigousuario = codigousuario;
    }

    public Integer getCodigousuario() {
        return codigousuario;
    }

    public void setCodigousuario(Integer codigousuario) {
        this.codigousuario = codigousuario;
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
        result = prime * result + ((codigousuario == null) ? 0 : codigousuario.hashCode());
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
        if (codigousuario == null) {
            if (other.codigousuario != null)
                return false;
        } else if (!codigousuario.equals(other.codigousuario))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SEG_USUARIO [codigousuario=" + codigousuario + ", mail=" + mail + ", clave=" + clave + ", nombre="
                + nombre + ", intentosfallidos=" + intentosfallidos + ", sueldo=" + sueldo + ", fechanacimiento="
                + fechanacimiento + ", version=" + version + "]";
    }

  

   

}
