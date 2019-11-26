package com.emprestimo.resources.exception;

public class ObjetoNaoEcontrado extends RuntimeException{
  
  private static final long serialVersionUID = 1L;
  
  public ObjetoNaoEcontrado(String msg) {
    super(msg);  
  }
  public ObjetoNaoEcontrado(String msg, Throwable cause) {
    super(msg, cause);
  }
  

}
