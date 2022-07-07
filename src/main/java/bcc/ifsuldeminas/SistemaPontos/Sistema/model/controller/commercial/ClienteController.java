package bcc.ifsuldeminas.SistemaPontos.Sistema.model.controller.commercial;

import bcc.ifsuldeminas.SistemaPontos.Sistema.model.entity.Usuario.Cliente;
import bcc.ifsuldeminas.SistemaPontos.Sistema.model.repositories.commercial.ClienteRepository;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/clientes")
public class ClienteController {


    private ClienteRepository clienteRepository;

    public ClienteController(ClienteRepository clienteRepository){
        this.clienteRepository = clienteRepository;
    }

    @GetMapping
    public List<Cliente> list(){
        return  clienteRepository.findAll();
    }

    @GetMapping("/{id}")
    public Cliente show (@PathVariable Long id){
        return clienteRepository.getById(id);
    }

    @PostMapping
    public Cliente save(@RequestBody Cliente cliente){
        return clienteRepository.save(cliente);
    }

    @PutMapping("/{id}")
    public Cliente update(@PathVariable Long id, @RequestBody Cliente cliente){
        Cliente clienteAux = clienteRepository.getById(id);
        clienteAux.setNome(cliente.getNome());
        clienteAux.setEndereco(cliente.getEndereco());
        return clienteRepository.save(clienteAux);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id){

        clienteRepository.deleteById(id);
    }
}
