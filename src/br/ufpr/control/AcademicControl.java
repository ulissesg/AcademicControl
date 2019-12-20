/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.control;

import br.ufpr.aluno.Aluno;
import br.ufpr.pessoas.Pessoa;

/**
 *
 * @author professor
 */
public class AcademicControl {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Aluno alu = new Aluno();
        alu.setNome("jose");
        alu.setDataCadastro("29-11-2019");
        alu.setCpf("085160429-36");
        alu.incluir(alu);
        

        alu.setNome("joao");
        alu.setDataCadastro("29-11-2019");
        alu.setCpf("085160429-36");
        alu.incluir(alu);
        
        alu.setNome("maria");
        alu.setDataCadastro("36-12-2019");
        alu.setCpf("659656-36");
        alu.incluir(alu);
        alu.listar("maria");
        
        
        alu.listar("jose");
        System.out.println(" ---------------------------------------------------");
        alu.listar("joao");
        
//        System.out.println(" ---------------------------------------------------");
//      
        

        alu.setNome("maria");
        alu.setDataCadastro("30-02-2019");
        alu.setCpf("085160429");
        alu.alterar(alu, 45);
        alu.listar("maria");
        
        alu.excluir(25);
        
        alu.listar("maria");
//        
//        System.out.println(" ---------------------------------------------------");
//        alu.listar("jose");
    }
    
}
