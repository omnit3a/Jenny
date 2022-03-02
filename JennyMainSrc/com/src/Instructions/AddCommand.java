package com.src.Instructions;

import com.src.Main;

public class AddCommand {
    public static void addCommand() {
        Main.PC++;
        Main.OPC++;
        try {
            int a = Main.vars.pop();                //this loads the top 2 values from the stack so that they can be added together
            int b = Main.vars.pop();
            Main.vars.push(a+b);
        } catch (Exception e){
            System.out.println(Main.PC+": Arithmetic Error");
            System.exit(253);
        }
    }
}
