package br.edu.com.cadastro.domain;

public class Pessoa {
   private final long id;
   private final String nome;

   public Pessoa(long id, String nome){
       this.id = id;
       this.nome = nome;
   }

   public long getId(){
       return id;
   }

   public String getNome(){
       return nome;
   }
}
