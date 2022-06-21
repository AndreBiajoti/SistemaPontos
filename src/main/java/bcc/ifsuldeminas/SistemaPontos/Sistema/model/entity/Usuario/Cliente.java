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

    
    private String nome;
    private String endereco;
    private int codigoFidelidade;
    private String senha;


}
