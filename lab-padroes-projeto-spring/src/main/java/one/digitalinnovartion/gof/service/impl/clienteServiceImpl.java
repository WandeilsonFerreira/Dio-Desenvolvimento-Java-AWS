package one.digitalinnovartion.gof.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import one.digitalinnovartion.gof.model.Cliente;
import one.digitalinnovartion.gof.model.ClienteRepository;
import one.digitalinnovartion.gof.model.Endereco;
import one.digitalinnovartion.gof.model.EnderecoRepository;
import one.digitalinnovartion.gof.service.ClienteService;



// TODO Strategy: Implementar os métodos definidos na interface.
// TODO Facade: Abstrair integrações com subsistemas, provendo uma interface simples.


@Service
public class clienteServiceImpl implements ClienteService {
//TODO Singleton: Injetar os componentes do Spring com @Autowired.
	@Autowired
	private ClienteRepository clienteRepository;
	
	@Autowired
	private EnderecoRepository enderecoRepository;
	
	@Override
	public Iterable<Cliente> buscarTodos() {	
		return clienteRepository.findAll();
	}

	@Override
	public Cliente buscarPorId(Long id) {
		Optional<Cliente> cliente = clienteRepository.findById(id);
		return cliente.get();
	}

	@Override
	public void inserir(Cliente cliente) {
		salvarClienteComCep(cliente);
		
	}

	private void salvarClienteComCep(Cliente cliente) {
		String cep = cliente.getEndereco().getCep();
		Endereco endereco = enderecoRepository.findByid(cep).orElseGet(() -> {
			Endereco novoEndereco = viaCepService.consultarCep(cep);
			enderecoRepository.save(novoEndereco);
			return novoEndereco;
		});
			cliente.setEndereco(endereco);
			clienteRepository.save(cliente);
	}

	@Override
	public void atualizar(Long id, Cliente cliente) {
		Optional<Cliente> clienteBd = clienteRepository.findById(id);
		if(clienteBd.isPresent()) {
			salvarClienteComCep(cliente);
		}
	}

	@Override
	public void deletar(Long id) {
		clienteRepository.deleteById(id);
		
	}
	
}
