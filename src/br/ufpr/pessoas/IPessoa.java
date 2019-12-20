/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.pessoas;

/**
 *
 * @author professor
 */
public interface IPessoa {
    
    public void incluir (Pessoa dados);
    
    public void excluir (int id);
    
    public void alterar (Pessoa dados);
    
    public void listar (String nome);
}
