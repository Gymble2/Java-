package javaTest.Complete;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Objects;

public class SavePassword extends RandomizePassword {

    private boolean exist = false;
    private  boolean found = true;

    public boolean CreateTxt(String nameFile){
        try {
            //Starts an object to create a File
            File creatFile = new File(nameFile);

            //Starts a file
            if (creatFile.createNewFile()){
                System.out.println("File Created: "+ creatFile.getName());
                exist = true;
                return exist;
            }else{ //Verify if a file is already exist
                System.out.println("File already creat");
                exist = true;
                return exist;
            }
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
            return exist;
        }
    }

    public String formatText(String Password, String User){
        //Starts an object for treatment of a String using
        //The array of chars
        StringBuilder sb = new StringBuilder();

        //Add the information to Array of chars and separate them whit
        // ";" for better searching the results
        sb.append(User);
        sb.append(Password);
        sb.insert(User.length(),';');
        return sb.toString();
    }

    public void WriteTxt(String lineTyped,String nameFile){
        try {
            //Starts an objects to write in the file
            FileWriter fw = new FileWriter(nameFile, true);
            BufferedWriter bw = new BufferedWriter(fw);

            //write in the file and give him a "jumpLine"
            bw.write(lineTyped);
            bw.write("\n");

            //Close the executions
            bw.close();
            fw.close();
            System.out.println("escrito");
        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public  boolean readTxt(String nameFile, String password){
        try {
            FileReader fr = new FileReader(nameFile);
            BufferedReader br = new BufferedReader(fr);
            FileWriter fw = new FileWriter(nameFile,true);
            BufferedWriter bw = new BufferedWriter(fw);

            String line;
            String [] sup;
            while((line = br.readLine()) != null && found) {
                //verifica se line esta empty
                //assert line != null;
                sup = line.split(";");

                if (Objects.equals(sup[1], password)) {
                    return found;
                }
            }
        }catch (IndexOutOfBoundsException indexOutOfBoundsException){
            System.out.println("Erros de index possiveis erros (Primeira linha vazia/segunda posição de informação acessada vazia)");
            return found = false;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return found;
    }

    public String readTxt(){
        return readTxt();
    }
}
