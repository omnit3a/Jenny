package com.src.Instructions;

import com.src.Main;

public class SubCommand {
    public static void subCommand() {
        Main.PC++;
        Main.OPC++;
        try {
            int a = Main.vars.pop();
            int b = Main.vars.pop();
            Main.vars.push(b-a);        //this pops the top two values of the stack, subtracts them using reverse polish notation, then pushes the sum onto the stack
        } catch (Exception e){
            System.out.println(Main.PC+": Arithmetic Error");
            System.exit(253);
        }
    }
}
