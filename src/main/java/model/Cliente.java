package model;
import javax.persistence.*;
import java.util.List;

@Entity
public class Cliente extends Usuario{
    
    public Cliente(String email, String senha, boolean nivel, Long id, String nome, String telefone, String endereco) {
            super(email, senha, nivel);
            this.id = id;
            this.nome = nome;
            this.telefone = telefone;
            this.endereco = endereco;
    }
        @OneToMany(mappedBy = "cliente", cascade = CascadeType.ALL)
    @Column(nullable = false)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private List<Orcamento> orcamentos;
    private String telefone;
    private String endereco;

    public List<Orcamento> getOrcamentos(){
        return orcamentos;
    }
    public void setOrcamentos(List<Orcamento> orcamentos) {
        this.orcamentos = orcamentos;
    }
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTelefone() {
        return telefone;
    }
    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    public String getEndereco() {
        return endereco;
    }
    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }
}