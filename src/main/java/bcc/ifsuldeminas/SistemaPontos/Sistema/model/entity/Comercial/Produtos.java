package bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Comercial;


import javax.persistence.*;

@Entity
public class Produtos {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private String nome;
    private int codigoProduto;
    private int estoqueInicial;
}
