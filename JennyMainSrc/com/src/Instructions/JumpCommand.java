package com.src.Instructions;

import com.src.FileReader;
import com.src.JumpUtil;
import com.src.Main;

import java.util.StringTokenizer;

public class JumpCommand {
    public static void jumpCommand(){
        Main.PC+=2;
        Main.OPC++;
        int PC = 0;
        try {
            Main.operandA = Integer.parseInt(Main.st.nextToken());
            JumpUtil.generateSumMapForA();
            String term = "";
            Main.st = new StringTokenizer(FileReader.commandText);                      //this does the same thing as the JnzCommand.jnzCommand() method, but unconditonally
            for (int i = 0 ; i < JumpUtil.sumMap.get(Main.operandA) ; i++) {
                term = Main.st.nextToken();
            }
        } catch (Exception e){
            System.out.println(Main.PC+": Non-Existent Element");
            System.exit(254);
        }
    }
}
