package bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Comercial;


import javax.persistence.*;
import java.util.Set;

@Entity
public class ItemCompra {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @ManyToOne
    private Produtos produtos;

    private String nomeProduto;
    private int qtdeProduto;


}
