package com.projetos;

import java.util.Scanner;


public class correcaoCpf {
    public static void main(String[] args) {

        formatacaoDeCpf documento = new formatacaoDeCpf();
        Scanner somas = new Scanner(System.in);
        String [] n;

        n = somas.nextLine().split("",11);

        documento.cPf(n);







        System.out.println(n);





        //formatacaoDeCpf.cPf(Arrays.toString(cpfComsplit));
        //System.out.println(formatacaoDeCpf.getCpf());












    }


}
