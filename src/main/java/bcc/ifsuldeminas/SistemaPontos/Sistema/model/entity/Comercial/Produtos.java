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

    public Object getNome() {
        return  this.nome;
    }

    public Object getEndereco() {
        return this.getEndereco();
    }

    public void setEndereco(Object endereco) {
    }

    public void setNome(Object nome) {
    }
}
