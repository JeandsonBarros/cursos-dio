package com.example.services.implementa;

import com.example.models.Cliente;
import com.example.models.Endereco;
import com.example.repository.ClienteRepository;
import com.example.repository.EnderecoRepository;
import com.example.services.ClienteService;
import com.example.services.ViaCepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

/**
 * Implementação da <b>Strategy</b> {@link ClienteService}, a qual pode ser
 * injetada pelo Spring (via {@link Autowired}). Com isso, como essa classe é um
 * {@link Service}, ela será tratada como um <b>Singleton</b>.
 *
 * @author falvojr
 */

/*
* A classe ClienteServiceImp que implementa ClienteService e está anotada com
* @Service é gerenciada pelo Spring, e o Spring entende que ao usar uma
* instância de ClienteService com o @Autowired vai ser possível usar
* os métodos da classe que a implementou,
* e a classe que a implementou foi ClienteServiceImp
* que fez a sobre inscrição(@Override) dos métodos de ClienteService.
*/

@Service
public class ClienteServiceImp implements ClienteService {

    // Singleton: Injetar os componentes do Spring com @Autowired.
    @Autowired
    private ClienteRepository clienteRepository;
    @Autowired
    private EnderecoRepository enderecoRepository;
    @Autowired
    private ViaCepService viaCepService;

    // Strategy: Implementar os métodos definidos na interface.
    // Facade: Abstrair integrações com subsistemas, provendo uma interface simples.

    @Override
    public Iterable<Cliente> buscarTodos() {
        return clienteRepository.findAll();
    }

    @Override
    public Cliente buscarPorId(Long id) {
        return clienteRepository.findById(id).get();
    }

    @Override
    public void inserir(Cliente cliente) {
        salvarClienteComCep(cliente);
    }

    @Override
    public void atualizar(Long id, Cliente cliente) {
        Optional<Cliente> clienteOptional = clienteRepository.findById(id);
        if (clienteOptional.isPresent()) {
            cliente.setId(id);
            salvarClienteComCep(cliente);
        }

    }

    @Override
    public void deletar(Long id) {
        boolean asCliente = clienteRepository.existsById(id);
        if (asCliente)
            clienteRepository.deleteById(id);
    }

    private void salvarClienteComCep(Cliente cliente) {
        // Verificar se o Endereco do Cliente já existe (pelo CEP).
        String cep = cliente.getEndereco().getCep();
        Endereco endereco = enderecoRepository.findById(cep).orElseGet(() -> {
            // Caso não exista, integrar com o ViaCEP e persistir o retorno.
            Endereco novoEndereco = viaCepService.consultarCep(cep);
            enderecoRepository.save(novoEndereco);
            return novoEndereco;
        });
        cliente.setEndereco(endereco);
        // Inserir Cliente, vinculando o Endereco (novo ou existente).
        clienteRepository.save(cliente);
    }

}
