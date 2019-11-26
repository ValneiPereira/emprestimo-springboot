package com.emprestimo.resources;

import java.util.List;

import javax.servlet.http.HttpServletResponse;
import javax.validation.Valid;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emprestimo.evento.RecursoCriadoEvento;
import com.emprestimo.model.Cliente;
import com.emprestimo.services.ClienteService;



@RestController
@RequestMapping(value = "/clientes")
public class ClienteResource {	
	
	@Autowired
	private ClienteService clienteService;
	
	@Autowired
	private ApplicationEventPublisher publicador;
	
  @RequestMapping(method = RequestMethod.GET)
  public List<Cliente> listarTodos() {
    return clienteService.listar();
  }

  @RequestMapping(value = "/{codCliente}", method = RequestMethod.GET)
  public ResponseEntity<?> buscarPorCodigo(@PathVariable Long codCliente) {
    Cliente cliente = clienteService.buscarPorCodigo(codCliente);
    return cliente != null ? ResponseEntity.ok(cliente) : ResponseEntity.notFound().build();
  }
	
	@RequestMapping(method = RequestMethod.POST)
  public ResponseEntity<?>criar(@Valid @RequestBody Cliente cliente, HttpServletResponse response){
    Cliente clienteSalva= clienteService.salvar(cliente);
    publicador.publishEvent(new RecursoCriadoEvento(this, response, clienteSalva.getCodCliente()));
    return ResponseEntity.status(HttpStatus.CREATED).body(clienteSalva);      
  }	
	 
  @RequestMapping(value = "/{codCliente}", method = RequestMethod.DELETE)
  public  ResponseEntity<Void> remover(@PathVariable Long codCliente) {
    clienteService.delete(codCliente);
    return ResponseEntity.noContent().build();
    
  }
	
  

}
