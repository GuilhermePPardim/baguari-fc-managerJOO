package br.com.guilherme.baguarifc.classe;

import br.com.guilherme.baguarifc.excecoes.ProfissionalLesionadoException;

public class ComissaoTecnica extends Profissional{
    public String funcao;

    public String getFuncao() {
        return funcao;
    }

    public void setFuncao(String funcao) {
        this.funcao = funcao;
    }
    @Override
    public boolean trabalhar() throws ProfissionalLesionadoException {
        return false;
    }
}
