package bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Usuario;


import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value= "PessoaJuridica")

public class PessoaJuridica extends Cliente{
    private String cnpj;
}
