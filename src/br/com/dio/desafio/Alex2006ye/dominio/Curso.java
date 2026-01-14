package br.com.dio.desafio.Alex2006ye.dominio;

import br.com.dio.desafio.dominio.Conteudo;

public class Curso extends Conteudo {
    //Atributo
    private int cargaHoraria;

    //Implementando método abstrato
    @Override
    public double calcularXp() {
        return XP_PADRAO * cargaHoraria;
    }

    //Construtor
    public Curso() {

    }

    //Getters e Setters
    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public void setCargaHoraria(int cargaHoraria) {
        this.cargaHoraria = cargaHoraria;
    }

    //Sobreescrita do método toString
    @Override
    public String toString() {
        return "Curso{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", cargaHoraria=" + cargaHoraria +
                '}';
    }
}
