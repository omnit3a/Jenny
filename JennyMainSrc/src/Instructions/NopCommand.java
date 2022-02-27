package src.Instructions;

import src.Main;

public class NopCommand {
    public static void nopCommand(){
        Main.PC++;
        Main.OPC++;
        try{
            Main.st.nextToken();
        }catch(Exception e){
            System.out.println(Main.PC+": End of Program");
        }
    }
}
