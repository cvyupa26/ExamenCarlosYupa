package ec.edu.com.arquitectura.examencarlosyupa.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "SEG_PERFIL")
public class SEG_PERFIL {

    @Id
    @Column(name = "COD_PERFIL", nullable = false, length = 8)
    private String cod_perfil;
    @Column(name = "NOMBRE", nullable = false, length = 100)
    private String nombre;

    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    public SEG_PERFIL() {
    }
    public SEG_PERFIL(String cod_perfil) {
        this.cod_perfil = cod_perfil;
    }
    public String getCod_perfil() {
        return cod_perfil;
    }
    public void setCod_perfil(String cod_perfil) {
        this.cod_perfil = cod_perfil;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
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
        result = prime * result + ((cod_perfil == null) ? 0 : cod_perfil.hashCode());
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
        SEG_PERFIL other = (SEG_PERFIL) obj;
        if (cod_perfil == null) {
            if (other.cod_perfil != null)
                return false;
        } else if (!cod_perfil.equals(other.cod_perfil))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "SEG_PERFIL [cod_perfil=" + cod_perfil + ", nombre=" + nombre + ", version=" + version + "]";
    }


    

}
