package com.src.Instructions;

import com.src.Main;

public class PopCommand {
    public static void popCommand(){
        Main.PC++;
        Main.OPC++;
        Main.vars.pop();            //this removes the value on top of the stack, and doesnt push it back on
    }
}
