package com.src.Instructions;

import com.src.Main;

public class PeekPPCommand {
    public static void peekPPCommand() {
        Main.PC++;
        Main.OPC++;
        try {
            int a = Main.vars.pop();
            a++;
            Main.vars.push(a);
        } catch (Exception e){
            System.out.println(Main.PC+": Nothing to pop");
        }
    }
}
