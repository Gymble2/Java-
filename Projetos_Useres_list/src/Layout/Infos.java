package Layout;

public  class Infos extends TollsForInfos {
    //Variables used for editing, format or just save the data's
    private String cpf;
    private String name;
    private String Cpf_Users = "   .   .   -  ";

    //Variables used for testing problems
    private boolean test = false;
    private boolean testText = false;
    private int curr = 0;

    //Object of manipulation of an Array of chars -> for String or from String  -> Array of chars
    StringBuilder sb = new StringBuilder();

    public void setName(String name){
        StringBuilder formattedName = new StringBuilder();
        // Takes the input string and formats it according to Brazilian Portuguese language rules
        // making the first letter uppercase and append the rest of the string
        if(StringVerify(name)){
            String firstName = name.substring(0, 1).toUpperCase() + name.substring(1);
            formattedName.append(firstName);
            this.name = String.valueOf(formattedName);
            testText = true;
        }
        else{
            testText = false;
        }
    }
    public String getName() {
        if(testText){
            return name;
        }
        else{
            return "";
        }

    }

    public void setCpf(char[] cpf){

        boolean verifyTest = IntVerify(new String(cpf));

        //assign a value for if of testFormat
        if(curr > 0){
            verifyTest = IntVerify(new String(cpf));
        }

        //testFormat
        if(cpf.length == 11 && verifyTest ) {
            //Make an array of chars using the Cpf_Users how a
            //base for format to cpf
            char[] Caract = Cpf_Users.toCharArray();
            //Append the infos to the right positions in the Cpf_Users
            for (int i = 0; i < cpf.length; i++) {
                if (Caract[i] != '.' || Caract[i] != '-') {
                    sb.append(cpf[i]);
                }
            }
            //Broke in parts the String"   .   .   -  " and add the punctuation
            //using StringBuilder
            sb.insert(3, '.');
            sb.insert(7, '.');
            sb.insert(11, '-');
            this.cpf = sb.toString();
            test = true;
        }
        //case the cpf typed is wrong in the format or in the data
        //typed return the infos right down
        else{
            test = false;
            curr+=1;
        }
    }

    public String getcpf(){
        if(test){
            return  cpf;
        }
        else {
            return cpf = "";
        }
    }

    @Override
    public void Message() {
        //just to show a litle of Override
        System.out.println("---------------------");
    }
}
