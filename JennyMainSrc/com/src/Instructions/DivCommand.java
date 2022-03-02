package com.src.Instructions;

import com.src.Main;

public class DivCommand {
    public static void divCommand() {
        Main.PC++;
        Main.OPC++;
        try {
            int a = Main.vars.pop();
            int b = Main.vars.pop();
            Main.vars.push(b/a);                        //this divides the top 2 entries on the stack by using reverse polish notation
        } catch (Exception e){
            System.out.println(Main.PC+": Arithmetic Error");
            System.exit(253);
        }
    }
}
