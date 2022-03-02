package com.src.Instructions;

import com.src.Main;

public class CompareCommand {
    public static void compareCommand() {
        Main.PC++;
        Main.OPC++;
        int A = Main.vars.pop();
        int B = Main.vars.pop();
        Main.ZeroFlag = A != B;                 //this compares the top 2 elements on the stack
        Main.vars.push(B);
        Main.vars.push(A);
    }
}
