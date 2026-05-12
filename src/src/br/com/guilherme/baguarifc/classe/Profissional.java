package br.com.guilherme.baguarifc.classe;

import br.com.guilherme.baguarifc.excecoes.ProfissionalLesionadoException;

public abstract class Profissional {
    private String nome;
    protected int salario;
    private int energia;
    private boolean lesao;

    public Profissional(){
        this.lesao = false;

    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }

    public void lesao()throws ProfissionalLesionadoException{
        if (this.lesao){
            this.lesao = false;
        }else
            throw new ProfissionalLesionadoException();

    }


    public abstract boolean trabalhar();
}
