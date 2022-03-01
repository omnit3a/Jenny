package com.src.Instructions;

import com.src.Main;

public class DupeCommand {
    public static void dupeCommand() {
        try{
            int tempA = Main.vars.pop();
            Main.vars.push(tempA);
            Main.vars.push(tempA);
        } catch (Exception e){
            System.out.println("No stack entry");
        }
    }
}
