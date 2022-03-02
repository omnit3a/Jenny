package com.src.Instructions;

import com.src.Main;

public class NopCommand {
    public static void nopCommand(){
        Main.PC++;
        Main.OPC++;
        try{
            Main.st.nextToken();            //this code is called whenever a command isnt recognized, and also its whats used for comments
        }catch(Exception e){
            System.out.println(Main.PC+": End of Program");
        }
    }
}
