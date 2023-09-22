package one.digitalinnovartion.gof.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import one.digitalinnovartion.gof.model.Cliente;
import one.digitalinnovartion.gof.service.ClienteService;

@RestController
@RequestMapping("clientes")
public class CleinteRestContoller {
	
	@Autowired
	private ClienteService clienteService;
	
	@GetMapping
	public ResponseEntity<Iterable<Cliente>> buscarTodos(){
		return ResponseEntity.ok(clienteService.buscarTodos());
	}
	

	
}
