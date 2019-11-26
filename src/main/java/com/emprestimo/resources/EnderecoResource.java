package com.emprestimo.resources;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.emprestimo.dto.EnderecoDTO;
import com.emprestimo.services.EnderecoService;



@RestController
@RequestMapping(value = "/enderecos")
public class EnderecoResource {	
	
	@Autowired
	private EnderecoService enderecoService;
	
	@Autowired
  private ModelMapper mapper;
	
	@RequestMapping(method = RequestMethod.GET)
  public ResponseEntity<List<EnderecoDTO>> listarEndereco() {
    return ResponseEntity.ok(enderecoService.todosEnderecos()
        .stream()
        .map(endereco -> mapper.map(endereco, EnderecoDTO.class))
        .collect(Collectors.toList()));
  }

  

}
