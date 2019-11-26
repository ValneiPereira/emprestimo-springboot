package com.emprestimo.resources.exception;

public class IntegridadeDeDados extends RuntimeException{
  
  private static final long serialVersionUID = 1L;
  
  public IntegridadeDeDados(String msg) {
    super(msg);  
  }
  public IntegridadeDeDados(String msg, Throwable cause) {
    super(msg, cause);
  }
  

}
