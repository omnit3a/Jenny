package com.src.Instructions;

import com.src.Main;

public class BringCommand {

    public static void bringCommand() {
        try {
            Main.operandA = Integer.parseInt(Main.st.nextToken());
            Main.operandA--;
            int[] elements = new int[Main.vars.size()];
            int tempA = Main.vars.pop();
            int tempB = 0;
            for (int i = Main.vars.size() ; i > Main.operandA+1 ; i--){     //this saves the elements need to be popped to access the specified stack entry...
                elements[i] = Main.vars.pop();
            }
            tempB = Main.vars.pop();
            for (int i = 0 ; i < elements.length ; i++){                    //and this replaces those elements that were popped
                Main.vars.push(elements[i]);
            }
            Main.vars.push(tempB);
            Main.vars.push(tempA);

        } catch (Exception e){
            System.out.println("Error copying entries");
        }
    }
}
