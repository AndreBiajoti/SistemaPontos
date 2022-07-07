package bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Posto;

import bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Pontos;

import javax.persistence.*;
import java.util.Set;


@Entity
public class Abastecimento {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    @OneToMany
    @JoinColumn(name="Abastecimento_id")
    private Set<Pontos> Pontos;


    private int valorAbastecido;
}
