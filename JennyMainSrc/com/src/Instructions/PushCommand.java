package com.src.Instructions;

import com.src.Main;

public class PushCommand {
    public static void pushCommand(){
        Main.PC+=2;
        Main.OPC++;
        String com = Main.st.nextToken();
        try {
            Main.operandA = Integer.parseInt(com);              //this tries to parse an int from the operand
            Main.vars.push(Main.operandA);                      //and then pushes the int to the stack if successful
        } catch (Exception e){
            System.out.println(Main.PC+": Non-Numeric Operand");    //TODO: push a string to a special String stack if an int cannot be parsed
        }
    }
}
