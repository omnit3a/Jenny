package com.src.Instructions;

import com.src.Main;

public class HaltCommand {
    public static void haltCommand(){
        try{
            Main.operandA = Integer.parseInt(Main.st.nextToken());          //this gets the exit code for the exit command
            System.exit(Main.operandA);
        } catch (Exception e){
            System.out.println(Main.PC+": Non-Numeric Operand or Exit code overflow");
            System.exit(15);
        }
    }
}
