import br.com.nbs.desafio.dominio.*;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {



        Curso curso = new Curso();
        Mentoria mentoria= new Mentoria();

        curso.setTitulo("POO");
        curso.setDescricao("Curso de Paradigma Programação Orientada a Objeto");
        curso.setCargaHoraria(2);
//        System.out.println(curso);


        mentoria.setDataInicial(LocalDate.now());
        mentoria.setTitulo("Java-POO");
        mentoria.setDescricao("Mentoria sobre POO em java");
//        System.out.println(mentoria);

        BootCamp bootCamp = new BootCamp();
        bootCamp.setNome("Bootcamp Java GFT");
        bootCamp.setDescricao("Curso Basico Java POO");
        bootCamp.getConteudos().add(curso);
        bootCamp.getConteudos().add(mentoria);

        Dev devjo = new Dev();
        devjo.setNome("Dev João");
        devjo.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos Joao " + devjo.getConteudosInscritos());
        devjo.progredir();
        devjo.progredir();
        System.out.println("Conteúdos Concluidos Joao " + devjo.getConteudosConcluidos());
        System.out.println("XP" + devjo.calcularXp());

        System.out.println("-------");

        Dev devCami = new Dev();
        devCami.setNome("Dev Cami");
        devCami.inscreverBootcamp(bootCamp);
        System.out.println("Conteúdos Inscritos Cami " + devCami.getConteudosInscritos());
        devCami.progredir();
        System.out.println("Conteúdos Concluidos Joao " + devCami.getConteudosConcluidos());
        System.out.println("XP" + devCami.calcularXp());








    }
}
