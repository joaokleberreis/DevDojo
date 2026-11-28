package Aintroducaoclasses.javacore.test;

import Aintroducaoclasses.javacore.domain.Carro;

public class CarroTest01 {
    public static void main (String[] args){
        Carro carro01 = new Carro();
        Carro carro02 = new Carro();

        carro01.nome = "GLA";
        carro01.modelo = "Mercedes";
        carro01.ano = 2026;

        System.out.println("---------Carro 1---------");
        System.out.println("Veículo: " + carro01.nome);
        System.out.println("Modelo: " + carro01.modelo);
        System.out.println("Ano: " + carro01.ano);


        carro02.nome = "M4";
        carro02.modelo = "BMW";
        carro02.ano = 2018;

        System.out.println("\n---------Carro 2---------");
        System.out.println("Veículo: " + carro02.nome);
        System.out.println("Modelo: " + carro02.modelo);
        System.out.println("Ano: " + carro02.ano);
    }
}
