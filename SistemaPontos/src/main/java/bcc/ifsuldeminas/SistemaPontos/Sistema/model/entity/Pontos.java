package bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Pontos {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private long id;
    private int qtdePontos;
}
