package bcc.ifsuldeminas.SistemaPontos.Sistema.model.controller.commercial;

import bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Comercial.Produtos;
import bcc.ifsuldeminas.SistemaPontos.Sistema.model.repositories.commercial.ProdutosRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/produtos")
public class ProdutoController {


    private ProdutosRepository produtosRepository;

    public void ProdutosRepository(ProdutosRepository produtosRepository){
        this.produtosRepository = produtosRepository;
    }

    @GetMapping
    public List<Produtos> list(){
        return  produtosRepository.findAll();
    }

    @GetMapping("/{id}")
    public Produtos show (@PathVariable Long id){
        return produtosRepository.getById(id);
    }

    @PostMapping
    public Produtos save(@RequestBody Produtos produtos){
        return produtosRepository.save(produtos);
    }

    @PutMapping("/{id}")
    public Produtos update(@PathVariable Long id, @RequestBody Produtos produtos){
        Produtos produtosAux = produtosRepository.getById(id);
        produtosAux.setNome(produtos.getNome());
        produtosAux.setEndereco(produtos.getEndereco());
        return produtosRepository.save(produtosAux);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

        produtosRepository.deleteById(id);
    }
}
