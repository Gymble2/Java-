

import Layout.Infos;
import ListTXT.WriteOnTXT;

import java.util.Scanner;

public class MainUsersListFileTXT extends Infos {
    public static void main(String[] args) {
        //Object to all the methods
        Infos p = new MainUsersListFileTXT();
        Scanner scanner= new Scanner(System.in);
        WriteOnTXT pencil= new Infos();

        //Create the file ou verify if he exists
        System.out.println("Type the name of file");
        System.out.println("*Dont push '.txt' on the name");
        String nameFile = scanner.nextLine() + ".txt";
        pencil.CreateTxt(nameFile);

        //Get infos for format
        p.Message();
        System.out.printf("Write your cpf: ");
        String data_cpf = scanner.next();
        scanner.nextLine(); //Broke and exclói the line how is occupied for scanner.next()
        p.Message();
        System.out.printf("Write your name: ");
        String Name = scanner.nextLine();

        //call constructor from object "p" for formatting and transformation of data´s
        p.setName(Name);
        p.setCpf(data_cpf.toCharArray());

    //Print the lines for aesthetics
        p.Message();
        //loop if the user type wrong input for that format
        while(true){
            if(p.getcpf() == ""){
                p.Message();
                System.out.println("Index out of range or letter writing instead of nums.");
                System.out.println("Type the infos cpf again:");
                data_cpf = scanner.next();
                p.setCpf(data_cpf.toCharArray());
                p.Message();
            }
            else{
                System.out.println(p.getcpf()+" Cpf typed whit perfection");
                break;
            }
        }//loop if the user type wrong input for that format
        while(true){
            if (p.getName() == "") {
                p.Message();
                System.out.println("Typed nums instead of letters");
                System.out.println("Type the infos name again:");
                Name = scanner.nextLine();
                p.setName(Name);
                p.Message();
            }
            else{
                System.out.println(p.getName()+" Name typed whit perfection");
                p.Message();
                break;
            }
        }
        //Format a text with a ";" to the separation of data´s
        String writeLine= pencil.formatText(p.getName(),data_cpf);
        //Write in the file
        pencil.WriteTxt(writeLine,nameFile);
    }
}
