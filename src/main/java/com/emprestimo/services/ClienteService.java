package com.emprestimo.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataIntegrityViolationException;
import org.springframework.stereotype.Service;

import com.emprestimo.model.Cliente;
import com.emprestimo.repository.ClienteRepository;
import com.emprestimo.resources.exception.IntegridadeDeDados;




@Service
public class ClienteService {
  
  @Autowired
  private ClienteRepository clienteRepository;
  
  public List<Cliente> listar(){
    return clienteRepository.findAll();
  }  
  
  public Cliente buscarPorCodigo(Long codCliente) {    
    Optional<Cliente> cliente = clienteRepository.findById(codCliente);
    
    return cliente.orElse(null);

  }
  
  public Cliente salvar(Cliente cliente){
    Cliente clienteSalva= clienteRepository.save(cliente);  
    return clienteSalva;      
  } 
  public void delete(Long codCliente) {
    buscarPorCodigo(codCliente);
    try {
      clienteRepository.deleteById(codCliente);
    } catch (DataIntegrityViolationException e) {
       throw new IntegridadeDeDados("Não é possivel excluir clientes com dados no banco");
    }
    
  }
  

}
