package javaTest.Complete;

import java.util.Scanner;

public class Main extends SavePassword{
    public static void main(String[] args) {
        SavePassword save= new SavePassword();
        Scanner user= new Scanner(System.in);
        String nameFile= "Test3";
        String user2;
        String password;


        if (save.CreateTxt(nameFile)) {
            System.out.println("Digite o usuario");
            System.out.println("------------------------");
            user2 = user.next();
            password = passwordGenerator();
            System.out.println(password);
            System.out.println("------------------------");
            save.readTxt(nameFile,password);
            if(save.readTxt(nameFile,password)){
                save.WriteTxt(save.formatText(password,user2),nameFile);
            }
        }
    }
}