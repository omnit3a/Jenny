package src.Instructions;

import src.Main;

public class CompareCommand {
    public static void compareCommand() {
        Main.PC++;
        Main.OPC++;
        int A = Main.vars.pop();
        int B = Main.vars.pop();
        Main.ZeroFlag = A != B;
        Main.vars.push(B);
        Main.vars.push(A);
    }
}
