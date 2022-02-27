package src.Instructions;

import src.Main;

public class PushCommand {
    public static void pushCommand(){
        Main.PC+=2;
        Main.OPC++;
        String com = Main.st.nextToken();
        try {
            Main.operandA = Integer.parseInt(com);
            Main.vars.push(Main.operandA);
        } catch (Exception e){
            System.out.println(Main.PC+": Non-Numeric Operand");
        }
    }
}
