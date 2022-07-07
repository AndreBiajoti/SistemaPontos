package bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Usuario;

import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue(value= "PessoaFisica")
public class PessoaFisica extends Cliente{
    private String cpf;
}
