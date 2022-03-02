package com.src.Instructions;

import com.src.Main;

public class PeekCommand {
    public static void peekCommand(){
        Main.PC++;
        Main.OPC++;
        System.out.println(Main.vars.peek());           //this prints the value on the top of the stack without modifiying it
    }
}
