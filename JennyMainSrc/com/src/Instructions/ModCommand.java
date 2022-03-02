package com.src.Instructions;

import com.src.Main;

public class ModCommand {
    public static void modCommand() {
        Main.PC++;
        Main.OPC++;
        try {
            int a = Main.vars.pop();                
            int b = Main.vars.pop();
            Main.vars.push(b%a);                    //this pops the top 2 values from the stack and applies the modulo operation using reverse polish notation, then pushes the sum
        } catch (Exception e){
            System.out.println(Main.PC+": Arithmetic Error");
            System.exit(253);
        }
    }
}
