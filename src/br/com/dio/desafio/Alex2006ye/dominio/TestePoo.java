package br.com.dio.desafio.Alex2006ye.dominio;

import java.time.LocalDate;

public class TestePoo {
    public static void main(String[] args) {
        //Testando a classe curso
        Curso curso = new Curso();
        curso.setTitulo("Curso Fullstack");
        curso.setDescricao("descrição de exemplo");
        curso.setCargaHoraria(10);

        System.out.println(curso);

        //Testando a classe bootcamp
        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Dev");
        bootcamp.setDescricao("Descrição exemplo");
        bootcamp.getConteudos().add(curso);

        System.out.println(bootcamp.getConteudos());

        //Testando a classe mentoria
        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição exemplo");
        mentoria.setData(LocalDate.now());

        System.out.println(mentoria);

        //Testando a classe dev
        Dev devAlex = new Dev();
        devAlex.setNome("Alex Carvalho");
        devAlex.inscreverBootcamp(bootcamp);
        System.out.println("Conteúdos Inscritos Alex:" + devAlex.getConteudosInscritos());
        devAlex.progredir();
        System.out.println("-");
        System.out.println("Conteúdos Concluídos Alex:" + devAlex.getConteudosConcluidos());
        System.out.println("XP:" + devAlex.calcularTotalXp());
    }
}
