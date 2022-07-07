package bcc.ifsuldeminas.SistemaPontos.Sistema.model.repositories.commercial;

import bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Usuario.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
