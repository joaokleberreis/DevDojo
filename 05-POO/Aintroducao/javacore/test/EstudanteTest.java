package Aintroducao.javacore.test;

import Aintroducao.javacore.domain.Estudante;

public class EstudanteTest {
    public static void main (String[] args){
        Estudante estudante = new Estudante();

        estudante.nome = "João";
        estudante.idade = 25;
        estudante.sexo = 'M';

        System.out.println("Nome: " +  estudante.nome);
        System.out.println("Idade: " + estudante.idade);
        System.out.println("Sexo : " + estudante.sexo);
    }
}
