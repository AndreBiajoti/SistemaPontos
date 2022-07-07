package bcc.ifsuldeminas.SistemaPontos.Sistema.model.controller.commercial;

import bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Posto.Funcionario;
import bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Usuario.Cliente;
import bcc.ifsuldeminas.SistemaPontos.Sistema.model.repositories.commercial.FuncionarioRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/Funcionarios")
public class FuncionarioController {


    private FuncionarioRepository funcionarioRepository;

    public FuncionarioController(FuncionarioRepository funcionarioRepository){
        this.funcionarioRepository = funcionarioRepository;
    }

    @GetMapping
    public List<Funcionario> list(){
        return  funcionarioRepository.findAll();
    }

    @GetMapping("/{id}")
    public Funcionario show (@PathVariable Long id){
        return funcionarioRepository.getById(id);
    }

    @PostMapping
    public Funcionario save(@RequestBody Funcionario cliente){
        return funcionarioRepository.save(cliente);
    }

    @PutMapping("/{id}")
    public Funcionario update(@PathVariable Long id, @RequestBody Cliente cliente, Cliente funcionario){
        Funcionario funcionarioAux = funcionarioRepository.getById(id);
        funcionarioAux.setNome(funcionario.getNome());
        funcionarioAux.setEndereco(funcionario.getEndereco());
        return funcionarioRepository.save(funcionarioAux);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

        funcionarioRepository.deleteById(id);
    }
}
