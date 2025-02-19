package model;
import javax.persistence.*;
import java.util.List;

@Entity
public class Orcamento {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "cliente_id") // FK do Cliente
    private Cliente cliente;

    @ManyToMany
    @JoinTable(
        name = "orcamento_produto", 
        joinColumns = @JoinColumn(name = "orcamento_id"), 
        inverseJoinColumns = @JoinColumn(name = "produto_id")
    )
    private List<Produto> produtos;

    private double total;

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

    
}