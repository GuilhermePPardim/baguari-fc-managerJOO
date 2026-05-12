package br.com.guilherme.baguarifc.classe;

import br.com.guilherme.baguarifc.excecoes.ProfissionalLesionadoException;

public class Jogador extends Profissional{

    public String posicao;

    public int getNumeroCamisa() {
        return numeroCamisa;
    }

    public void setNumeroCamisa(int numeroCamisa) {
        this.numeroCamisa = numeroCamisa;
    }

    public int numeroCamisa;

    public String getPosicao() {
        return posicao;
    }

    public void setPosicao(String posicao) {
        this.posicao = posicao;
    }

    public boolean treinar(){
        return false;
    }

    public boolean jogarPartida() {
        return false;
    }

    @Override
    public boolean trabalhar() throws ProfissionalLesionadoException {
        this.verificarLesao();
        System.out.println("O jogador não esta lesionado pode jogar");
        return false;
    }


}
