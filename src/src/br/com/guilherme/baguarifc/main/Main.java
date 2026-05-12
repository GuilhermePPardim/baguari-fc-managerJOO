package br.com.guilherme.baguarifc.main;

import br.com.guilherme.baguarifc.classe.ComissaoTecnica;
import br.com.guilherme.baguarifc.classe.Jogador;
import br.com.guilherme.baguarifc.classe.Profissional;
import br.com.guilherme.baguarifc.excecoes.EnergiaInsuficienteException;
import br.com.guilherme.baguarifc.excecoes.ProfissionalLesionadoException;

public class Main {
    public static void main(String[] args) {
        try {
            Jogador membro = new Jogador();
            membro.setNome("Guilherme");
            System.out.println(String.format("O jogador: %s", membro.getNome()));
            membro.setSalario(1800);
            System.out.println(String.format("o Salario é: %f", membro.getSalario()));
            membro.setPosicao("ATA");
            System.out.println(String.format("a posição do jogador é: %s ", membro.getPosicao()));
            membro.setEnergia(100);
            membro.trabalhar();


            ComissaoTecnica membrocomi = new ComissaoTecnica();
            membrocomi.setNome("Lucas");
            System.out.println(String.format("O jogador: %s", membrocomi.getNome()));
            membrocomi.setSalario(2000);
            System.out.println(String.format("o Salario é: %f", membrocomi.getSalario()));
            membrocomi.setFuncao("tecnico");
            System.out.println(String.format("A função é : %s", membrocomi.getFuncao()));
            membrocomi.setEnergia(100);
            membrocomi.trabalhar();


        }
        catch(ProfissionalLesionadoException e){
                System.out.println("jogador lesionado");
        }


    }
}
