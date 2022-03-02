package com.src.Instructions;

import com.src.Main;

public class PeekMMCommand {
    public static void peekMMCommand() {
        Main.PC++;
        Main.OPC++;
        try {
            int a = Main.vars.pop();
            a--;                        //this pops the value on the top of the stack, decrements it, then pushes it back onto the stack
            Main.vars.push(a);
        } catch (Exception e){
            System.out.println(Main.PC+": Nothing to pop");
        }
    }
}
