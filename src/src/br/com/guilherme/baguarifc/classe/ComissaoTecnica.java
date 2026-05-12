package br.com.guilherme.baguarifc.classe;

public class ComissaoTecnica extends Profissional{
    public String funcao;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    @Override
    public boolean trabalhar(){
        return false;
    }
}
