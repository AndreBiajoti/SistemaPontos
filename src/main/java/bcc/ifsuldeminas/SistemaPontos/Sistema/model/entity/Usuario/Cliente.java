package bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Usuario;

import javax.persistence.*;
import java.util.Set;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "class")
public class Cliente  {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @OneToMany
    @JoinColumn(name="cliente_id")
    private Set<bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Comercial.Compras> Compras;
    @OneToMany
    @JoinColumn(name="cliente_id")
    private Set<bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Pontos> Pontos;
    @OneToMany
    @JoinColumn(name="cliente_id")
    private Set<bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Posto.Abastecimento> Abastecimento;

    
    private String Nome;
    private String Endereco;
    private int codigoFidelidade;
    private String senha;


    public Object getNome() {
        return this.Nome;
    }

    public void setNome(Object nome) {
    }

    public Object getEndereco() {
        return  this.Endereco;
    }

    public void setEndereco(Object endereco) {
    }
}
