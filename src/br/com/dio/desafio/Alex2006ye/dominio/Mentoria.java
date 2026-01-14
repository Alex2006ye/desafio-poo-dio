package br.com.dio.desafio.Alex2006ye.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    //Por algum motivo, tive que colocar esse aqui primeiro pra não dar erro
    @Override
    public double calcularXp() {
        return 0;
    }

    //Implementando método abstrato
    @Override
    public double calcularxp() {
        return XP_PADRAO + 20d;
    }

    //Construtores
    public Mentoria() {
    }

    //Getters e Setters
    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    //Sobreescrevendo toString
    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", data=" + data +
                '}';
    }
}
