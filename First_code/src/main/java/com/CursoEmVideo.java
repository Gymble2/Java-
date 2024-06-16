package com.java.cursoemvideo;
import java.util.Scanner;
public class CursoEmVideo {

    public static void main (String[] args){
        Scanner teclado= new Scanner(System.in);
        String nome = teclado.nextLine();
        float nota = teclado.nextFloat();
        System.out.format("A nota do %s é %.2f",nome,nota);



    }
}
