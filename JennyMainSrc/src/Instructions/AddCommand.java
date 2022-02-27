package src.Instructions;

import src.Main;

public class AddCommand {
    public static void addCommand() {
        Main.PC++;
        Main.OPC++;
        try {
            int a = Main.vars.pop();
            int b = Main.vars.pop();
            Main.vars.push(a+b);
        } catch (Exception e){
            System.out.println(Main.PC+": Arithmetic Error");
            System.exit(253);
        }
    }
}
