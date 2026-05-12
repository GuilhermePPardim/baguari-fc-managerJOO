package br.com.guilherme.baguarifc.classe;

public class Jogador extends Profissional{

    public String posicao;
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
    public boolean trabalhar(){
        System.out.println("Jogar");
        return false;
    }


}
