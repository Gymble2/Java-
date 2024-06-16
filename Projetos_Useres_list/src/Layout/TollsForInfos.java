package Layout;

import ListTXT.WriteOnTXT;

import java.util.regex.Pattern;

public abstract class TollsForInfos extends WriteOnTXT {
        //This abstract is just a litlle Orientation Object
        public abstract void Message();
        public boolean StringVerify(String data){
                //verify if the String data have letter upper or down,
                //verify if he has letters whit punctuation  and space like " "
                if(Pattern.matches("[a-z,A-Z,À-ü ]+",data)){
                        return true;
                }
                else {
                       return false;
                }
        }
        public boolean IntVerify(String data){
                //verify if The String data Have numbers in
                //every position
                if(Pattern.matches("[0-9 ]+",data)){
                        return true;
                }
                else {
                        return false;
                }
        }
}


