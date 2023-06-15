package ec.edu.com.arquitectura.examencarlosyupa.model;

import java.sql.Date;



import jakarta.persistence.Column;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import jakarta.persistence.Version;

@Entity
@Table(name = "SEG_USUARIO_PERFIL")
public class SEG_USUARIO_PERFIL {

    @EmbeddedId
    private SEG_USUARIO_PERFILPK pk;

    @Column(name = "FECHA_CREACION", nullable = false)
    private Date fechacreacion;
    @Column(name = "ES_ACTIVO", nullable = false)
    private Boolean estado;
    @Version
    @Column(name = "VERSION", nullable = false)
    private Long version;

    @ManyToOne
    @JoinColumn(name = "COD_USUARIO",referencedColumnName = "COD_USUARIO",insertable = false,updatable = false)
    private SEG_USUARIO seg_usuario;
     @JoinColumn(name = "COD_PERFIL",referencedColumnName = "COD_PERFIL",insertable = false,updatable = false)
    private SEG_PERFIL seg_perfil;


    public SEG_USUARIO_PERFIL() {
    }
    public SEG_USUARIO_PERFIL(SEG_USUARIO_PERFILPK pk) {
        this.pk = pk;
    }
    public SEG_USUARIO_PERFILPK getPk() {
        return pk;
    }
    public void setPk(SEG_USUARIO_PERFILPK pk) {
        this.pk = pk;
    }
    public Date getFechacreacion() {
        return fechacreacion;
    }
    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }
    public Boolean getEstado() {
        return estado;
    }
    public void setEstado(Boolean estado) {
        this.estado = estado;
    }
    public Long getVersion() {
        return version;
    }
    public void setVersion(Long version) {
        this.version = version;
    }
    public SEG_USUARIO getSeg_usuario() {
        return seg_usuario;
    }
    public void setSeg_usuario(SEG_USUARIO seg_usuario) {
        this.seg_usuario = seg_usuario;
    }
    public SEG_PERFIL getSeg_perfil() {
        return seg_perfil;
    }
    public void setSeg_perfil(SEG_PERFIL seg_perfil) {
        this.seg_perfil = seg_perfil;
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((pk == null) ? 0 : pk.hashCode());
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
        SEG_USUARIO_PERFIL other = (SEG_USUARIO_PERFIL) obj;
        if (pk == null) {
            if (other.pk != null)
                return false;
        } else if (!pk.equals(other.pk))
            return false;
        return true;
    }
    @Override
    public String toString() {
        return "SEG_USUARIO_PERFIL [pk=" + pk + ", fechacreacion=" + fechacreacion + ", estado=" + estado + ", version="
                + version + ", seg_usuario=" + seg_usuario + ", seg_perfil=" + seg_perfil + "]";
    }

    
    



}
