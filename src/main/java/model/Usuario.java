package model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.InheritanceType;

import java.io.Serializable;

@Entity
@Inheritance(strategy = InheritanceType.JOINED)
@Table(name = "usuarios")
public class Usuario implements Serializable{
    
    @Column(nullable = false, unique = true)
    private String email;
    private String senha;
    private boolean nivel;

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public boolean isNivel() {
        return nivel;
    }

    public void setNivel(boolean nivel) {
        this.nivel = nivel;
    }

    public Usuario(String email, String senha, boolean nivel) {
        this.email = email;
        this.senha = senha;
        this.nivel = nivel;
    }       
}