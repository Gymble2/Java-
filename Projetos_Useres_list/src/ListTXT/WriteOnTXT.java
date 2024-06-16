package ListTXT;

import java.io.*;

public class WriteOnTXT {

    private String form;

    public void CreateTxt(String nameTxt){
        try {
            //Starts an object to create a File
            File creatFile = new File(nameTxt);
            //Starts a file
            if (creatFile.createNewFile()){
                System.out.println("File Created: "+ creatFile.getName());
            }else{ //Verify if a file is already exist
                System.out.println("File already creat");
            }
        }catch (IOException e){
            System.out.println("Error");
            e.printStackTrace();
        }
    }

    public String formatText(String name, String cpf){
        //Starts an object for treatment of a String using
        //The array of chars
        StringBuilder sb = new StringBuilder();

        //Add the information to Array of chars and separate them whit
        // ";" for better searching the results
        sb.append(name);
        sb.append(cpf);
        sb.insert(name.length(),';');
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

        } catch (IOException e) {
            System.out.println("Error");
            e.printStackTrace();
        }
    }
}
