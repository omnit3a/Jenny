package com.src.Instructions;

import com.src.Main;

public class PrintCommand {
    public static void printCommand() {
        Main.PC++;
        Main.OPC++;
        try{
            String msg = Main.st.nextToken();
            if (msg.endsWith("^")) {            //this adds a new line character to the operand if it ends with "^"
                msg = msg.stripLeading();      
                msg = msg.replace('^', ' ');    //this removes the "^" character
                msg = msg.strip();              //this removes the trailing spaces
                msg = msg.replace("_", " ");    //and finally, this adds in the spaces to the operand
                System.out.println(msg);
            } else {
                msg = msg.stripLeading();
                msg = msg.replace("_"," ");
                System.out.print(msg);
            }
        } catch (Exception e){
            System.exit(254);
        }

    }
}
