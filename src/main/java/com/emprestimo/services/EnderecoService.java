package com.emprestimo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.emprestimo.model.Endereco;
import com.emprestimo.repository.EnderecoRepository;




@Service
public class EnderecoService {
  @Autowired
  private EnderecoRepository enderecoRepository;
  
  public List<Endereco> todosEnderecos() {
    return enderecoRepository.findAll();
    
  }
  
}
