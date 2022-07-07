package bcc.ifsuldeminas.SistemaPontos.Sistema.model.repositories.commercial;

import bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Comercial.Produtos;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProdutosRepository extends JpaRepository<Produtos, Long> {
}
