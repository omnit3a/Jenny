package com.src.Instructions;

import com.src.FileReader;
import com.src.JumpUtil;
import com.src.Main;

import java.util.StringTokenizer;

public class JnzCommand {
    public static void jnzCommand(){
        Main.PC+=2;
        Main.OPC++;
        int PC = 0;
        try {
            Main.operandA = Integer.parseInt(Main.st.nextToken());
            Main.operandB = Integer.parseInt(Main.st.nextToken());
            JumpUtil.generateSumMapForA();
            String term = "";
            if (!Main.ZeroFlag) {
                Main.st = new StringTokenizer(FileReader.commandText);
                for (int i = 0 ; i < JumpUtil.sumMap.get(Main.operandA) ; i++) {
                    term = Main.st.nextToken();
                }
            } else {
                Main.st = new StringTokenizer(FileReader.commandText);
                for (int i = 0 ; i < JumpUtil.sumMap.get(Main.operandB) ; i++) {
                    term = Main.st.nextToken();
                }
            }
        } catch (Exception e){
            System.out.println(Main.PC+": Non-Existent Element");
            System.exit(254);
        }
    }
}
