package src.Instructions;

import java.util.HashMap;

public class InstructionValues{

    public static HashMap<String,Integer> tokens = new HashMap<>();

    public static void FillTokens() {
        tokens.put("GET",1);
        tokens.put("POP", 1);
        tokens.put("PEEK", 1);
        tokens.put("PEEK++", 1);
        tokens.put("PEEK--", 1);
        tokens.put("ADD", 1);
        tokens.put("SUB", 1);
        tokens.put("MUL", 1);
        tokens.put("DIV", 1);
        tokens.put("MOD", 1);
        tokens.put("COMPARE", 1);
        tokens.put("NOP", 1);
        tokens.put("HALT",2);
        tokens.put("PUSH", 2);
        tokens.put("JUMP",2);
        tokens.put("PRINT",2);
        tokens.put("BRING",2);
        tokens.put("JNE",3);
        tokens.put("JE",3);
    }
}