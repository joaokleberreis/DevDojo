package Aintroducaoclasses.javacore.test;

import Aintroducaoclasses.javacore.domain.Professor;

public class ProfessorTest01 {
    public static void main(String[] args) {
        Professor professor = new Professor();

        professor.nomeProfessor = "Alfred";
        professor.idadeProfessor = 40;
        professor.sexoProfessor = 'M';

        System.out.println("Nome : " + professor.nomeProfessor);
        System.out.println("Idade : " + professor.idadeProfessor);
        System.out.println("Sexo     : " + professor.sexoProfessor);
    }
}
