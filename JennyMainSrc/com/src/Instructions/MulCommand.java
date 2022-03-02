package com.src.Instructions;

import com.src.Main;

public class MulCommand {
    public static void mulCommand() {
        Main.PC++;
        Main.OPC++;
        try {
            int a = Main.vars.pop();
            int b = Main.vars.pop();
            Main.vars.push(a*b);                //this pops the top 2 values from the stack, then multiples them together and pushes the sum onto the stack
        } catch (Exception e){
            System.out.println(Main.PC+": Arithmetic Error");
            System.exit(253);
        }
    }
}
