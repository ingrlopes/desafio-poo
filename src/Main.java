
import java.time.LocalDate;

import Desafio.Dominio.Bootcamp;
import Desafio.Dominio.Curso;
import Desafio.Dominio.Dev;
import Desafio.Dominio.Mentoria;

public class Main {
    public static void main(String[] args) {

        Curso curso1 = new Curso();
        curso1.setTitulo("curso Java");
        curso1.setDescricao("Java básico");
        curso1.setCargaHoraria(10);

        Curso curso2 = new Curso();
        curso2.setTitulo("curso Git");
        curso2.setDescricao("comandos Git");
        curso2.setCargaHoraria(3);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de Java");
        mentoria.setDescricao("Java intermediário");
        mentoria.setData(LocalDate.now());

        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Java avançado");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev dev1 = new Dev();
        dev1.setNome("Ingrid");
        dev1.inscrever(bootcamp);
        System.out.println("> Ingrid Conteúdos inscritos: " + dev1.getInscritos());
        dev1.progredir();
        dev1.progredir();
        dev1.progredir();
        System.out.println("-");
        System.out.println("> Ingrid Conteúdos concluídos: " + dev1.getConcluidos());
        System.out.println("> Ingrid Conteúdos inscritos: " + dev1.getInscritos());
        System.out.println("XP: " + dev1.totalXp());

        System.out.println("-----------");

        Dev dev2 = new Dev();
        dev2.setNome("Erika");
        dev2.inscrever(bootcamp);
        System.out.println("> Erika Conteúdos inscritos: " + dev2.getInscritos());
        dev2.progredir();
        dev2.progredir();
        System.out.println("-");
        System.out.println("> Erika Conteúdos concluídos: " + dev2.getConcluidos());
        System.out.println("> Erika Conteúdos inscritos: " + dev2.getInscritos());
        System.out.println("XP: " + dev2.totalXp());
    }
}