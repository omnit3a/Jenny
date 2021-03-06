package com.src.Instructions;

import com.src.FileReader;
import com.src.JumpUtil;
import com.src.Main;

import java.util.StringTokenizer;

public class JzCommand {
    public static void jzCommand(){
        Main.PC+=2;
        Main.OPC++;
        int tempPC = 0;
        int PC = 0;
        try {
            Main.operandA = Integer.parseInt(Main.st.nextToken());
            Main.operandB = Integer.parseInt(Main.st.nextToken());
            JumpUtil.generateSumMapForA();
            String term = "";
            if (Main.ZeroFlag) {                                                        //FIXME: the code for branching doesnt work, for some reason
                Main.st = new StringTokenizer(FileReader.commandText);                  //this code **should** do the same thing as JnzCommand.jnzCommand(), but with the
                for (int i = 0 ; i < JumpUtil.sumMap.get(Main.operandA) ; i++) {        //opposite condition
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
