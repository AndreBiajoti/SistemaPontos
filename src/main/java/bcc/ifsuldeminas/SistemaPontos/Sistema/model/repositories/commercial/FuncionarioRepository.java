package bcc.ifsuldeminas.SistemaPontos.Sistema.model.repositories.commercial;

import bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Posto.Funcionario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FuncionarioRepository extends JpaRepository<Funcionario, Long> {
}
