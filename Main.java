import java.time.LocalDate;

import desafio.Bootcamp;
import desafio.Curso;
import desafio.Dev;
import desafio.Mentoria;

public class Main{
    public static void main(String[]args){
        Curso curso1 = new Curso();
        curso1.setTitulo("curso java");
        curso1.setDescricao("descrição curso java");
        curso1.setCargaHoraria(8);
        curso1.adicionarValor(7);
        curso1.adicionarValor(8);
        curso1.avaliarDesempenho();

        Curso curso2 = new Curso();
        curso2.setTitulo("curso js");
        curso2.setDescricao("descrição curso js");
        curso2.setCargaHoraria(4);
        curso2.adicionarValor(5);
        curso2.adicionarValor(5);

        Mentoria mentoria = new Mentoria();
        mentoria.setTitulo("mentoria de java");
        mentoria.setDescricao("descrição mentoria java");
        mentoria.setData(LocalDate.now());


        Bootcamp bootcamp = new Bootcamp();
        bootcamp.setNome("Bootcamp Java Developer");
        bootcamp.setDescricao("Descrição Bootcamp Java Developer");
        bootcamp.getConteudos().add(curso1);
        bootcamp.getConteudos().add(curso2);
        bootcamp.getConteudos().add(mentoria);

        Dev devCamila = new Dev();
        devCamila.setNome("Camila");
        devCamila.inscrever(bootcamp);
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        devCamila.progredir(curso1);
        devCamila.progredir(curso2);
        devCamila.progredir(curso2);
        devCamila.progredir(curso1);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos Camila:" + devCamila.getConteudosInscritos());
        System.out.println("Conteúdos Concluídos Camila:" + devCamila.getConteudosConcluidos());
        System.out.println("XP:" + devCamila.calcularXP());

        System.out.println("-------");

        Dev devJoao = new Dev();
        devJoao.setNome("Joao");
        devJoao.inscrever(bootcamp);
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        devJoao.progredir(curso1);
        devJoao.progredir(curso1);
        devJoao.progredir(curso2);
        System.out.println("-");
        System.out.println("Conteúdos Inscritos João:" + devJoao.getConteudosInscritos());
        System.out.println("Conteúdos Concluidos João:" + devJoao.getConteudosConcluidos());
        System.out.println("XP:" + devJoao.calcularXP());
        System.out.printf("A média de todos os alunos no Curso 1 foi: %.2f\n",curso1.avaliarDesempenho());
        System.out.printf("A média de todos os alunos no Curso 2 foi: %.2f\n",curso2.avaliarDesempenho());


    }
}