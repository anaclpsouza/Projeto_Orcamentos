package model;

import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente extends Usuario {

    @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    private List<Orcamento> orcamentos;

    public List<Orcamento> getOrcamentos() {
        return orcamentos;
    }

    public void setOrcamentos(List<Orcamento> orcamentos) {
        this.orcamentos = orcamentos;
    }

    
}