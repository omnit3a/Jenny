package com.src;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Stack;
import java.util.StringTokenizer;
import com.src.Instructions.*;

public class Main {

    public static StringTokenizer st;

    public static int PC = 0;
    public static int OPC = 0;

    public static int operandA = 0;
    public static int operandB = 0;

    public static String com = "";

    public static Stack<Integer> vars = new Stack<>();
    public static boolean ZeroFlag = false;

    public static void Tokenizer() {                                    //this is what actually loops through the code
        st = new StringTokenizer(FileReader.commandText);
        PC = 0;
        OPC = 0;
        while (st.hasMoreTokens()) {
            com = st.nextToken();
            switch (com) {
                case "ADD" -> AddCommand.addCommand();
                case "SUB" -> SubCommand.subCommand();
                case "MUL" -> MulCommand.mulCommand();
                case "DIV" -> DivCommand.divCommand();
                case "MOD" -> ModCommand.modCommand();
                case "POP"  -> PopCommand.popCommand();
                case "PUSH" -> PushCommand.pushCommand();
                case "PEEK" -> PeekCommand.peekCommand();
                case "PEEK++" -> PeekPPCommand.peekPPCommand();
                case "PEEK--" -> PeekMMCommand.peekMMCommand();
                case "COMPARE" -> CompareCommand.compareCommand();
                case "PRINT" -> PrintCommand.printCommand();       //add ^ to the end of a line to make it into println
                case "JE" -> JnzCommand.jnzCommand();
                case "JNE" -> JzCommand.jzCommand();
                case "JUMP" -> JumpCommand.jumpCommand();
                case "GET" -> GetCommand.getCommand();
                case "BRING" -> BringCommand.bringCommand();
                case "DUPE" -> DupeCommand.dupeCommand();
                case "HALT" -> HaltCommand.haltCommand();
                default -> NopCommand.nopCommand();
            }
        }
    }

        public static void main(String[] args) throws Exception{
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            FileReader.Reader(reader.readLine());           //this opens the file specifed by the user, so that the correct file is loaded into the interpreter
            InstructionValues.FillTokens();
            Main.Tokenizer();
        }
}
