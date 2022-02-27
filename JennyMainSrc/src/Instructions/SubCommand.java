package src.Instructions;

import src.Main;

public class SubCommand {
    public static void subCommand() {
        Main.PC++;
        Main.OPC++;
        try {
            int a = Main.vars.pop();
            int b = Main.vars.pop();
            Main.vars.push(b-a);
        } catch (Exception e){
            System.out.println(Main.PC+": Arithmetic Error");
            System.exit(253);
        }
    }
}
