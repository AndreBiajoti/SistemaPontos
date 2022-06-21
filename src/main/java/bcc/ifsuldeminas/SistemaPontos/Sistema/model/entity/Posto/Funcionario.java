package bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Posto;

import javax.persistence.*;
import java.util.Set;


@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "class")
public class Funcionario {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @OneToMany
    @JoinColumn(name="Funcionario_id")
    private Set<Abastecimento> Abastecimento;


    private String nome;
    private int telefone;
    private int identificacao;
}
