package com.src;

import com.src.Instructions.InstructionValues;

import java.util.HashMap;
import java.util.StringTokenizer;

public class JumpUtil {
    public static HashMap<Integer, Integer> sumMap = new HashMap<>();
    public static HashMap<Integer, Integer> sumMapB = new HashMap<>();

    public static void clearSumMap(){
        sumMap.clear();
        sumMapB.clear();
    }

    public static void generateSumMapForA() {                   //this is used to generate the line numbers for jumping
        int sum = 0;
        int lineNumber = 1;
        Main.st = new StringTokenizer(FileReader.commandText);
        while (lineNumber != Main.operandA) {
            String com = Main.st.nextToken();
            try {
                if (InstructionValues.tokens.get(com) > 1) {
                    lineNumber++;
                    sum += InstructionValues.tokens.get(com);
                } else {
                    lineNumber++;
                    sum++;
                }
                sumMap.put(lineNumber, sum);
            } catch (Exception ignored) {

            }
        }
        Main.st = new StringTokenizer(FileReader.commandText);
    }

}
