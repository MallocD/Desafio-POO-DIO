import br.com.nbs.desafio.dominio.Curso;
import br.com.nbs.desafio.dominio.Mentoria;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Curso curso = new Curso();
        Mentoria mentoria= new Mentoria();

        curso.setTitulo("POO");
        curso.setDescricao("Curso de Paradigma Programação Orientada a Objeto");
        curso.setCargaHoraria(2);
        System.out.println(curso);

        mentoria.setDataInicial(LocalDate.now());
        mentoria.setTitulo("Java-POO");
        mentoria.setDescricao("Mentoria sobre POO em java");
        System.out.println(mentoria);

    }
}
