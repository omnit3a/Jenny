package src.Instructions;

import src.Main;

public class HaltCommand {
    public static void haltCommand(){
        try{
            Main.operandA = Integer.parseInt(Main.st.nextToken());
            System.exit(Main.operandA);
        } catch (Exception e){
            System.out.println(Main.PC+": Non-Numeric Operand or Exit code overflow");
            System.exit(15);
        }
    }
}
