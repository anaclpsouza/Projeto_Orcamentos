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

    // Getters e Setters
}