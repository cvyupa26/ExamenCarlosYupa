package ec.edu.com.arquitectura.examencarlosyupa.model;

import java.io.Serializable;

import jakarta.persistence.Column;

public class SEG_USUARIO_PERFILPK implements Serializable {

    @Column(name = "COD_USUARIO", nullable = false)
    private Integer codigousuario;
    @Column(name = "COD_PERFIL", nullable = false,length = 8)
    private Integer codigoperfil;

    public SEG_USUARIO_PERFILPK() {
    }

    public SEG_USUARIO_PERFILPK(Integer codigousuario, Integer codigoperfil) {
        this.codigousuario = codigousuario;
        this.codigoperfil = codigoperfil;
    }

    public Integer getCodigousuario() {
        return codigousuario;
    }

    public void setCodigousuario(Integer codigousuario) {
        this.codigousuario = codigousuario;
    }

    public Integer getCodigoperfil() {
        return codigoperfil;
    }

    public void setCodigoperfil(Integer codigoperfil) {
        this.codigoperfil = codigoperfil;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((codigousuario == null) ? 0 : codigousuario.hashCode());
        result = prime * result + ((codigoperfil == null) ? 0 : codigoperfil.hashCode());
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
        SEG_USUARIO_PERFILPK other = (SEG_USUARIO_PERFILPK) obj;
        if (codigousuario == null) {
            if (other.codigousuario != null)
                return false;
        } else if (!codigousuario.equals(other.codigousuario))
            return false;
        if (codigoperfil == null) {
            if (other.codigoperfil != null)
                return false;
        } else if (!codigoperfil.equals(other.codigoperfil))
            return false;
        return true;
    }

    @Override
    public String toString() {
        return "SEG_USUARIO_PERFILPK [codigousuario=" + codigousuario + ", codigoperfil=" + codigoperfil + "]";
    }

    
    
    
    
}
