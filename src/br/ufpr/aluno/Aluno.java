/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.ufpr.aluno;

import br.ufpr.pessoas.IPessoa;
import br.ufpr.pessoas.Pessoa;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author professor
 */
public class Aluno extends Pessoa implements IPessoa {

    private int matricula;
    List<Aluno> alunos = new ArrayList<>();
    
    @Override
    public void incluir(Pessoa dados) {
        Aluno alu = new Aluno();
        alu.setNome(dados.getNome());
        alu.setCpf(dados.getCpf());
        alu.setDataCadastro(dados.getDataCadastro());
        alu.setMatricula(25);
        alunos.add(alu);
        
    }

    @Override
    public void excluir(int id) {
        int x = buscaPessoa(id);
        alunos.remove(x);
    }

    @Override
    public void alterar(Pessoa dados) {
        Aluno alu = new Aluno();
        int x = buscaPessoa(dados.getNome());
        alu = alunos.get(x);
        alu.setCpf(dados.getCpf());
        alu.setDataCadastro(dados.getDataCadastro());
        alu.setMatricula(alu.getMatricula());
        alunos.set(x, alu);
        
    }
    
    public void alterar(Pessoa dados, int mat) {
        Aluno alu = new Aluno();
        int x = buscaPessoa(dados.getNome());
        alu = alunos.get(x);
        alu.setCpf(dados.getCpf());
        alu.setDataCadastro(dados.getDataCadastro());
        alu.setMatricula(mat);
        alunos.set(x, alu);
        
    }
    
    @Override
    public void listar(String nome) {
        Aluno alu = new Aluno();
        int x = buscaPessoa(nome);
        alu = alunos.get(x);
        System.out.println("Matricula: " + alu.getMatricula()+
                "\nNome: " + alu.getNome() + 
                "\nCPF: "  + alu.getCpf()+
                "\nData de cadastro: " + alu.getDataCadastro());
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    
    public int buscaPessoa(String nome){
        for (int i = 0; i < alunos.size(); i++) {
            if (alunos.get(i).getNome().equalsIgnoreCase(nome)){
                return i;
            }
        }
        System.out.println("Não encontrado");
        return -2;
    }
    
    public int buscaPessoa(int x){
        for (int i = 0; i < alunos.size(); i++) {
            if ((alunos.get(i).getMatricula() == x)){
            } else {
                return i;
            }
        }
        System.out.println("Não encontrado");
        return -2;
    }
    
}
