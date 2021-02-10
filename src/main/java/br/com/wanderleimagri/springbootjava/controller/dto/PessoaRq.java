package br.com.wanderleimagri.springbootjava.controller.dto;

public class PessoaRq {

  private String nome;
  private String sobrenome;

  public String getNome() {
    return this.nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSobrenome() {
    return this.sobrenome;
  }

  public void setSobrenome(String sobrenome) {
    this.sobrenome = sobrenome;
  }
}
