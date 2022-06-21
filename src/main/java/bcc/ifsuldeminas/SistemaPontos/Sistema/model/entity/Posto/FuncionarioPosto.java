package bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Posto;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;
import javax.persistence.ManyToOne;

@Entity
@DiscriminatorValue(value= "FuncionarioPosto")
public class FuncionarioPosto extends Funcionario{

    private String senhaFuncionario;
}
