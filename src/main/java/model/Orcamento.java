package model;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.GenerationType;

import java.io.Serializable;
import java.util.List;


@Entity
@Table(name = "orcamento")
public class Orcamento implements Serializable{
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)  // Gera id automaticamente
    private Long id;

    @ManyToMany
    @JoinTable(
        name = "produto_por_orcamento",  // Nome da tabela intermediária
        joinColumns = @JoinColumn(name = "orcamento_id"),  // Chave estrangeira para Orcamento
        inverseJoinColumns = @JoinColumn(name = "produto_id")  // Chave estrangeira para Produto
    )
    private List<Produto> produtos;  // Lista de produtos no orçamento

    private double valor;  // Valor somado dos produtos

    private String nome;
    private String telefone;
    private String email;
    
    @Lob  // Usado para campos grandes, como texto longo
    private String endereco;  // Endereço do cliente

    private boolean enviado;
    private boolean aprovado;

    // Getters e setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public boolean isEnviado() {
        return enviado;
    }

    public void setEnviado(boolean enviado) {
        this.enviado = enviado;
    }

    public boolean isAprovado() {
        return aprovado;
    }

    public void setAprovado(boolean aprovado) {
        this.aprovado = aprovado;
    }

    
}
