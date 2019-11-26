package com.emprestimo.dto;

import java.io.Serializable;

public class EnderecoDTO implements Serializable {

  private static final long serialVersionUID = 1L;
  
  private Long codEndereco;
  private String nomeRua;
  private String CEP;
  private String numeroEndereco;
  private String bairro;
  private String cidade;
  private String estado;
  private Long cliente;
  
  
  
  
  public Long getCodEndereco() {
    return codEndereco;
  }
  public void setCodEndereco(Long codEndereco) {
    this.codEndereco = codEndereco;
  }
  
  public String getNomeRua() {
    return nomeRua;
  }
  public void setNomeRua(String nomeRua) {
    this.nomeRua = nomeRua;
  }
  public String getCEP() {
    return CEP;
  }
  public void setCEP(String cEP) {
    CEP = cEP;
  }
  public String getNumeroEndereco() {
    return numeroEndereco;
  }
  public void setNumeroEndereco(String numeroEndereco) {
    this.numeroEndereco = numeroEndereco;
  }
  public Long getCliente() {
    return cliente;
  }
  public void setCliente(Long cliente) {
    this.cliente = cliente;
  }
  public String getBairro() {
    return bairro;
  }
  public void setBairro(String bairro) {
    this.bairro = bairro;
  }
  public String getCidade() {
    return cidade;
  }
  public void setCidade(String cidade) {
    this.cidade = cidade;
  }
  public String getEstado() {
    return estado;
  }
  public void setEstado(String estado) {
    this.estado = estado;
  }
  
  
  
}
