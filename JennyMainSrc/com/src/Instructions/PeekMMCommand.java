package com.src.Instructions;

import com.src.Main;

public class PeekMMCommand {
    public static void peekMMCommand() {
        Main.PC++;
        Main.OPC++;
        try {
            int a = Main.vars.pop();
            a--;
            Main.vars.push(a);
        } catch (Exception e){
            System.out.println(Main.PC+": Nothing to pop");
        }
    }
}
