package Aintroducao.javacore.test;

import Aintroducao.javacore.domain.Estudante;

public class EstudanteTest02 {
    public static void main (String[] args){
        Estudante estudante = new Estudante();

        estudante.nome = "Bruce";
        System.out.println(estudante.nome);
        System.out.println(estudante.idade);
        System.out.println(estudante.sexo);

        Estudante estudante2 = new Estudante();

        System.out.println("----------------------------");

        estudante2.nome = "Wayne";
        System.out.println(estudante2.nome);
        System.out.println(estudante2.idade);
        System.out.println(estudante2.sexo);

    }
}
