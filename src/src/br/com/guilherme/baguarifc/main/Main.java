package br.com.guilherme.baguarifc.main;

import br.com.guilherme.baguarifc.classe.ComissaoTecnica;
import br.com.guilherme.baguarifc.classe.Jogador;
import br.com.guilherme.baguarifc.classe.Profissional;
import br.com.guilherme.baguarifc.excecoes.EnergiaInsuficienteException;
import br.com.guilherme.baguarifc.excecoes.ProfissionalLesionadoException;

public class Main {
    public static void main(String[] args) throws ProfissionalLesionadoException {
            Jogador membro = new Jogador();
            membro.setNome("Guilherme");
            System.out.println(String.format("O jogador: %s", membro.getNome()));
            membro.setSalario(1800);
            System.out.println(String.format("o Salario é: %f", membro.getSalario()));
            membro.setPosicao("ATA");
            System.out.println(String.format("a posição do jogador é: %s ", membro.getPosicao()));
            membro.setEnergia(100);
            System.out.println(String.format("Energia atual: %d", membro.getEnergia()));
            membro.setNumeroCamisa(10);
            System.out.println(String.format("numero camisa: %d",membro.getNumeroCamisa()));
            membro.setLesao(true);
            System.out.println(String.format("O jogador está lesionado: %b", membro.isLesao()));
        try {
            membro.trabalhar();
            System.out.println("Guilherme treinou e gastou energia!");
        } catch(ProfissionalLesionadoException e) {
            System.out.println("ERRO: O jogador " + membro.getNome() + " está lesionado e não pode jogar!");
        }


        System.out.println("*****************************************");
            ComissaoTecnica membrocomi = new ComissaoTecnica();
            membrocomi.setNome("Lucas");
            System.out.println(String.format("O Membro da comissao: %s", membrocomi.getNome()));
            membrocomi.setSalario(2000);
            System.out.println(String.format("o Salario é: %f", membrocomi.getSalario()));
            membrocomi.setFuncao("tecnico");
            System.out.println(String.format("A função é : %s", membrocomi.getFuncao()));
            membrocomi.setEnergia(100);
            System.out.println(String.format("Energia atual: %d", membro.getEnergia()));
            membrocomi.trabalhar();




    }
}
