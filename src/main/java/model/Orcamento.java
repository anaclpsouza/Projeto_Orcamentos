package model;
import javax.persistence.Id;
import javax.persistence.Entity;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.ManyToOne;
import javax.persistence.ManyToMany;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.GenerationType;

import java.io.Serializable;
import java.util.List;

@Entity
@Table(name = "orcamentos")
public class Orcamento implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "id_cliente", nullable = false) // FK do Cliente
    private Cliente cliente;

    @ManyToMany
    @JoinTable(
        name = "produto_por_orcamento", 
        joinColumns = @JoinColumn(name = "id_orcamento"), 
        inverseJoinColumns = @JoinColumn(name = "id_produto")
    )
    private List<Produto> produtos;
    private double total;
    private double aprovado;

    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public Cliente getCliente() {
        return cliente;
    }
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }
    public List<Produto> getProdutos() {
        return produtos;
    }
    public void setProdutos(List<Produto> produtos) {
        this.produtos = produtos;
    }
    public double getTotal() {
        return total;
    }
    public void setTotal(double total) {
        this.total = total;
    }
    public double getAprovado() {
        return aprovado;
    }
    public void setAprovado(double aprovado) {
        this.aprovado = aprovado;
    }
}