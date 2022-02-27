package src.Instructions;

import src.Main;

public class PopCommand {
    public static void popCommand(){
        Main.PC++;
        Main.OPC++;
        Main.vars.pop();
    }
}
